package pattern.factorydesign.factory.function;

import pattern.factorydesign.product.Animal;
import pattern.factorydesign.product.Dog;

//标准的Dog工厂
public class DogFactory implements AnimalFactory {
    @Override
    public Animal getAnimal() {
        return new Dog();
    }
}
