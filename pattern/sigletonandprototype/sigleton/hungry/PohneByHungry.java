package pattern.sigletonandprototype.sigleton.hungry;
//单例模式：某个资源对象可以共享复用（配置，IOC），使用时不需要多个实例的场景
//实现单例模式：保证使用过程中只有一个对象实例，并提供一个全局的访问该实例的入口
// 方式之一：饿汉式
public class PohneByHungry {
    //生活中打电话时不需要每次拨号都新买一个电话，可以用同一部电话实现

    private PohneByHungry(){//防止对外新建实例

    }
    //事先创建好实例
    private static PohneByHungry instance = new PohneByHungry();

    //

    public static PohneByHungry getInstance() {//对外提供的全局访问入口
        return instance;
    }

    //这样就保证了每次需要打电话拿到的都是同一部电话
    //优点：不管什么时候拿，都确保了单例是同一个，因为是拿之前就创建好了的不存在线程安全问题
    //缺点：由于提前创建好，类默认加载时就创建存于内存，不使用之前都是占着资源的。
}
