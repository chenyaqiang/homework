package sigletonandprototype.sigleton.lazy;

//方式之二：懒汉式，在使用的时候才会创建实例
public class PhoneByLazy {
    private static PhoneByLazy instance = null;//默认不提前创建实例

    private PhoneByLazy() {

    }

    public synchronized PhoneByLazy getInstance() {//由于使用时才初始化，
        // 在创建实例时存在多个线程同时进入到instance为null的逻辑
        // 造成创建多个实例情况，所以该方法需要同步加锁
        if (instance != null) {
            return instance;
        } else {
            instance = new PhoneByLazy();
            return instance;
        }
    }
    //优点:在未使用单例时，不会创建对象，避免了饿汉内存占用不使的情况
    //缺点：由于需要同步线程，必然性能有损
}

// /结合内部类默认不加载以及类只会加载一次的特性，
// 对懒汉式进行改造,把创建对象过程放入内部类加载的过程
class PhoneByLazyUp {
    private static boolean status = false;
    //防止反射入侵创建对象的状态标志，
    // 存在疑问？在引用内部类之前用反射创建对象时呢
    private PhoneByLazyUp() {
        synchronized (this) {
            if (status == false) {
                status = !status;
            } else {
                throw new RuntimeException("单例被入侵");
            }
        }
    }

    public static final PhoneByLazyUp getInstance() {
        return Inner.instance;
    }

    private static class Inner {//内部类在被访问前默认不加载，也就不会初始化创建对象，
        // 一旦加载之后就不会再次加载（类只会加载一次）
        // 这样就保证了使用前时没有新建对象的，一旦新建完成内部类初始化之后，
        // instance 保存的就始终是同一个对象
        private static PhoneByLazyUp instance = new PhoneByLazyUp();
    }
    //优点：解决了上面懒汉式性能问题
}
