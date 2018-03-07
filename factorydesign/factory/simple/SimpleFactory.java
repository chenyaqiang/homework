package factorydesign.factory.simple;

import factorydesign.product.Animal;
import factorydesign.product.Bird;
import factorydesign.product.Cat;
import factorydesign.product.Dog;

/**
 * 简单工厂
 */
public class SimpleFactory {
    //作坊式生产，根据用户给出的需求（配置），交付对应产品
    public Animal getAnimal(String animalName){
        if ("cat".equals(animalName)){
            return new Cat();
        }else if ("dog".equals(animalName)){
            return new Dog();
        }else if ("bird".equals(animalName)){
            return new Bird();
        }else {
            System.out.println("no animal like "+animalName);
            return null;
        }
    }
}
