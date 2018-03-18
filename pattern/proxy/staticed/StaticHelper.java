package pattern.proxy.staticed;

import pattern.proxy.client.Person;

public class StaticHelper {
    //获取代理目标的引用
    private Person target;
    StaticHelper(Person target){
        this.target = target;
    }
    //静态代理，开始之前目标的业务是明确的,
    // 目标业务的扩展只能手动跟随扩展
    public void findJob(){
        System.out.println("我是代理你要找工作吗？");
        target.findJob();
        System.out.println("找到了，你看这工作合适吗？");
    }
    public void findRoom(){
        System.out.println("我是代理，你要找房子吗？");
        target.findRoom();
        System.out.println("找到了，你看这房子合适吗？");
    }
}
