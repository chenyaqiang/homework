package pattern.observer;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

//被观察对象，发布者
public class Publisher extends Eventlisentner{

    void doA(){
        System.out.println(" do A");
        trigger(EventType.ON_A);
    }
    void doB(){
        System.out.println(" do B");
        trigger(EventType.ON_B);
    }
}
