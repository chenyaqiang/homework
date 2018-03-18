package pattern.proxy.cglib;

import pattern.proxy.client.Person;
import pattern.proxy.client.XiaoLi;

public class CglibTest {
    public static void main(String[] args) {
        Person p = (Person) new CglibProxy().getInstance(XiaoLi.class);
        p.findRoom();
        p.findJob();
    }
}
