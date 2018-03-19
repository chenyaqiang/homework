package pattern.observer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Eventlisentner {
    Map<EventType, Event> registor = new HashMap<EventType, Event>();

    protected void addLisentner(EventType type, Event e) {
        registor.put(type, e);
    }

    protected void trigger(EventType type) {
        if (registor.containsKey(type)) {
            Object obj = registor.get(type).getTarget();
            Method method = registor.get(type).getMethod();
            try {
                method.invoke(obj, registor.get(type));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
