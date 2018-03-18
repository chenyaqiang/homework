package pattern.factorydesign.factory.abstrcact;

import pattern.factorydesign.factory.function.BirdFactory;
import pattern.factorydesign.factory.function.CatFactory;
import pattern.factorydesign.factory.function.DogFactory;
import pattern.factorydesign.product.Animal;

//实现抽象工厂，完成具体生产过程输出产品
public class AnimalsFactory extends AbstractFactory {

    @Override
    public Animal getCat() {
        //专一职责，到cat工厂生产cat
        return new CatFactory().getAnimal();
    }

    @Override
    public Animal getDog() {
        return new DogFactory().getAnimal();
    }

    @Override
    public Animal getBird() {
        return new BirdFactory().getAnimal();
    }
}
