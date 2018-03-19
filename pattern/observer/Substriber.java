package pattern.observer;
//观察者，订阅方
public class Substriber {
    public void onA(Event e){
        System.out.println("观察者收到A事件");
    }
    public void onB(Event e){
        System.out.println("观察者收到B事件");
    }
}
