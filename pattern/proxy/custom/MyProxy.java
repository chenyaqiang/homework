package pattern.proxy.custom;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URLDecoder;

public class MyProxy {
    private static String ln = "\r\n";
    public static Object newMyInstance(MyClassLoader classLoader,Class<?>[] interfaces,MyInvocationHandler h){
       try { //1.生成代理类代码
           String src = getSource(interfaces);
           //2保存代码到文件
           String filePath = MyProxy.class.getResource("").getPath();
           filePath = URLDecoder.decode(filePath,"utf-8");
           System.out.println(filePath);
           File file = new File(filePath + "$MyProxy0.java");
           FileWriter writer = new FileWriter(file);
           writer.write(src);
           writer.flush();
           writer.close();
           //3.编译生成的代码
           JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
           StandardJavaFileManager manager = compiler.getStandardFileManager(null,null,null);
           Iterable iterable = manager.getJavaFileObjects(file);
           JavaCompiler.CompilationTask task = compiler.getTask(null,manager,null,null,null,iterable);
           task.call();
           manager.close();
           //4.加载生成的字节码文件
           Class clazz =  classLoader.findClass("$MyProxy0");
           Constructor constructor = clazz.getConstructor(MyInvocationHandler.class);
           //5.创建生成的代理对象并返回
           return constructor.newInstance(h);
       }catch (Exception e){
           e.printStackTrace();
       }
           return null;
    }

    private static String getSource(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("package pattern.proxy.custom;" + ln);
        sb.append("import pattern.proxy.client.Person;" + ln);
        sb.append("import java.lang.reflect.Method;" + ln);
        sb.append("public class $MyProxy0 implements " + interfaces[0].getName() + "{" + ln);

        sb.append("MyInvocationHandler h;" + ln);

        sb.append("public $MyProxy0(MyInvocationHandler h) { " + ln);

        sb.append("this.h = h;");

        sb.append("}" + ln);


        for (Method m : interfaces[0].getMethods()){
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" + ln);
            sb.append("try{" + ln);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});" + ln);
            sb.append("this.h.invoke(this,m,null);" + ln);
            sb.append("}catch(Throwable e){" + ln);
            sb.append("e.printStackTrace();" + ln);
            sb.append("}");
            sb.append("}");
        }

        sb.append("}" + ln);

        return sb.toString();
    }
}
