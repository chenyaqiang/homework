package factorydesign.factory.function;

import factorydesign.product.Animal;
import factorydesign.product.Cat;

//标准的cat工厂
public class CatFactory implements AnimalFactory {
    @Override
    public Animal getAnimal() {
        return new Cat();
    }
}
