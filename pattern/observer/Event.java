package pattern.observer;

import java.lang.reflect.Method;

//事件
public class Event {
    private Object target;
    private Method method;

    public Event() {
    }

    public Event(Object target, Method method) {
        this.target = target;
        this.method = method;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }
}
