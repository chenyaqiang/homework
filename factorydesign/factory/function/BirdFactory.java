package factorydesign.factory.function;

import factorydesign.product.Animal;
import factorydesign.product.Bird;
//标准的bird工厂
public class BirdFactory implements AnimalFactory {
    @Override
    public Animal getAnimal() {
        return new Bird();
    }
}
