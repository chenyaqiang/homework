package pattern.factorydesign.factory.function;

import pattern.factorydesign.product.Animal;
//动物工厂的规范
public interface AnimalFactory {
    Animal getAnimal();
}
