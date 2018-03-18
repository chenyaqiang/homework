package pattern.proxy.custom;

import java.io.*;
import java.net.URLDecoder;

public class MyClassLoader extends ClassLoader {
    File classPathFile;
    public MyClassLoader(){
        String classPath = MyClassLoader.class.getResource("").getPath();
        try {
            classPath = URLDecoder.decode(classPath,"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        classPathFile = new File(classPath);
    }
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = MyClassLoader.class.getPackage().getName()+"."+name;
        System.out.println(className);
        if (classPathFile!=null){
            File classFile = new File(classPathFile,name.replaceAll("\\.","/")+".class");
            if (classFile.exists()){
                FileInputStream in = null;
                ByteArrayOutputStream out =null;
                try{
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte[] bytes = new byte[1024];
                    int len = -1;
                    while ((len=in.read(bytes))!=-1){
                        out.write(bytes,0,len);
                    }
                    return defineClass(className,out.toByteArray(),0,out.size());
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    if (null!=in){
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (out!=null){
                        try {
                            out.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        }
        return null;
    }
}
