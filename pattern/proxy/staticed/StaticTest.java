package pattern.proxy.staticed;

import pattern.proxy.client.XiaoLi;

public class StaticTest {
    public static void main(String[] args) {
        XiaoLi xl = new XiaoLi();
        StaticHelper staticProxy = new StaticHelper(xl);
        System.out.println("找工作代理过程");
        staticProxy.findJob();
        System.out.println("找房子代理过程");
        staticProxy.findRoom();
    }
}
