package pattern.proxy.client;

public class XiaoLi implements Person {
    @Override
    public void findJob() {
        System.out.println("我是小李，我要找工作");
    }

    @Override
    public void findRoom() {
        System.out.println("我是小李，我要找房子");
    }
}
