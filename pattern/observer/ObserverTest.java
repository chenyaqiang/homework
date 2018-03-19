package pattern.observer;

import java.lang.reflect.Method;

public class ObserverTest {
    public static void main(String[] args) throws NoSuchMethodException {
        Publisher p = new Publisher();
        Substriber s = new Substriber();
        Method onA = Substriber.class.getMethod("onA",Event.class);
        Method onB = Substriber.class.getMethod("onB",Event.class);
        p.addLisentner(EventType.ON_A,new Event(s,onA));
        p.doA();

        //动态代理实现
        System.out.println("===============");
        PublishByProxy p2 = new PublishByProxy();

        ProxyForPub proxy = new ProxyForPub();
        proxy.addLisentner(EventType.ON_A,new Event(s,onA));
        proxy.addLisentner(EventType.ON_B,new Event(s,onB));
        PublishByProxy p3 = (PublishByProxy) proxy.getInstance(p2);
        p3.doA();
        p3.doB();
    }
}
