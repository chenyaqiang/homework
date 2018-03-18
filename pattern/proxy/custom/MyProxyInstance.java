package pattern.proxy.custom;

import pattern.proxy.client.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyProxyInstance implements MyInvocationHandler {
    private Person target;
    public Object getInstance(Person target){
       this.target = target;
        return MyProxy.newMyInstance(new MyClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) {
        System.out.println("自定义代理前");
        Object obj = null;
        try {
            obj = method.invoke(target,args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("自定义代理后");
        return obj;
    }
}
