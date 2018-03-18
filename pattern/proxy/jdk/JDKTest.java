package pattern.proxy.jdk;

import pattern.proxy.client.Person;
import pattern.proxy.client.XiaoLi;

public class JDKTest {
    public static void main(String[] args) {
        Person jdkProxy = (Person) new JdkProxy().getInstance(new XiaoLi());
        jdkProxy.findJob();
        jdkProxy.findRoom();
    }
}
