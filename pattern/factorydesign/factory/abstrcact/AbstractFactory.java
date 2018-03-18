package pattern.factorydesign.factory.abstrcact;

import pattern.factorydesign.product.Animal;

//抽象工厂  提供多产品线负责对应产品，既保证规范又能提高效率
public abstract class AbstractFactory {
    //cat 生产线
    public abstract Animal getCat();
    //dog 生产线
    public abstract Animal getDog();
    //bird生产线
    public abstract Animal getBird();
}
