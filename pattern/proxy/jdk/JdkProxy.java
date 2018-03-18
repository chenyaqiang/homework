package pattern.proxy.jdk;

import pattern.proxy.client.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler {
    //获得代理目标引用
    private Person target;
    //获得新生成的代理对象
    public Object getInstance(Person target){
        this.target = target;
        Class clazz = target.getClass();//取得类对象（代理目标类模板）
        //传入目标类加载器，目标类的所有接口，执行代理方法的handler,
        // 利用字节码重组生成代理对象类并加载创建新的代理对象
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    //业务代理的具体过程
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是代理，有什么能帮你吗？");
        method.invoke(target,args);
        System.out.println("你的请求已完成，你看合适吗？");
        return null;
    }
}
