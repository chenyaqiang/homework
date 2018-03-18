package pattern.proxy.custom;

import pattern.proxy.client.Person;
import pattern.proxy.client.XiaoLi;

public class CustomTest {
    public static void main(String[] args) {
        Person p = new XiaoLi();
        MyProxyInstance proxy = new MyProxyInstance();
        Person xiaoliproxy =  (Person) proxy.getInstance(p);
        xiaoliproxy.findJob();
        xiaoliproxy.findRoom();
    }
}
