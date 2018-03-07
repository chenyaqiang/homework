package factorydesign.factory.function;

import factorydesign.product.Animal;
import factorydesign.product.Dog;

//标准的Dog工厂
public class DogFactory implements AnimalFactory {
    @Override
    public Animal getAnimal() {
        return new Dog();
    }
}
