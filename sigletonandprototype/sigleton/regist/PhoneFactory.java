package sigletonandprototype.sigleton.regist;

import java.util.concurrent.ConcurrentHashMap;

//方式之三：注册登记式；spring中的getBean
//每使用一个对象前都先都将其注册到一个（线程安全的）固定（保证存取对象一致性）的容器中，
// 从容器中获取实例使用，但是注册（存）的过程会有线程安全问题使创建不唯一
public class PhoneFactory {
    private ConcurrentHashMap<String, PhoneRegist> collection = new ConcurrentHashMap();

    public PhoneRegist getPhone(String name) {
        if (collection.containsKey(name)) {
            return collection.get(name);
        } else {
            collection.put(name, new PhoneRegist());//注册登记过程
            return collection.get(name);
        }
    }
}

class PhoneRegist {
}
