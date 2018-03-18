package pattern.factorydesign.factory.function;

import pattern.factorydesign.product.Animal;
import pattern.factorydesign.product.Bird;
//标准的bird工厂
public class BirdFactory implements AnimalFactory {
    @Override
    public Animal getAnimal() {
        return new Bird();
    }
}
