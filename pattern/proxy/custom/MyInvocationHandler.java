package pattern.proxy.custom;

import java.lang.reflect.Method;

public interface MyInvocationHandler {
    Object invoke(Object o, Method method,Object[] args);
}
