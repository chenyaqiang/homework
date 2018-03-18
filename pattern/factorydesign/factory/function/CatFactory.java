package pattern.factorydesign.factory.function;

import pattern.factorydesign.product.Animal;
import pattern.factorydesign.product.Cat;

//标准的cat工厂
public class CatFactory implements AnimalFactory {
    @Override
    public Animal getAnimal() {
        return new Cat();
    }
}
