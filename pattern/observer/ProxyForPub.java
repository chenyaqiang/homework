package pattern.observer;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyForPub extends Eventlisentner implements MethodInterceptor{
    private PublishByProxy target;
    public Object getInstance(PublishByProxy target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        enhancer.setSuperclass(target.getClass());
      return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object re = methodProxy.invokeSuper(o,objects);

        if (method.getName().equals("doA")){
            trigger(EventType.ON_A);
        }
        if(method.getName().equals("doB")){
            trigger(EventType.ON_B);
        }

        return re;

    }
}
