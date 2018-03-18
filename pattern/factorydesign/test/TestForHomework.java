package pattern.factorydesign.test;

import pattern.factorydesign.factory.abstrcact.AnimalsFactory;
import pattern.factorydesign.factory.function.AnimalFactory;
import pattern.factorydesign.factory.function.CatFactory;
import pattern.factorydesign.factory.simple.SimpleFactory;
import pattern.factorydesign.product.Animal;
import pattern.factorydesign.product.Cat;

public class TestForHomework {
    public static void main(String[] args) {
        //传统方式
        System.out.println("传统获取产品方式");
        Animal animal = new Cat();
        animal.voice();
        //简单工厂方式，生产模式不规范（产品不标准）小作坊获取，需对产品有具体配置（主动说清楚要什么）
        System.out.println("简单工厂方式");
        SimpleFactory factory = new SimpleFactory();
        Animal dog = factory.getAnimal("dog");
        dog.voice();
        Animal ss = factory.getAnimal("ss");
        //工厂方法，生产模式规范（接口规范约束），产品标准的(什么工厂就生产什么产品)，但不同的产品需要到对应工厂获取，也存在用户对工厂配置过程
        System.out.println("工厂方法方式");
        AnimalFactory factory1 = new CatFactory();
        Animal cat = factory1.getAnimal();
        cat.voice();
        //抽象工厂，提供流水线的生产（多产品供应，每条流水线负责每个对应产品组件）规范高效，用户只需选择，是很好的COC（约定优于配置）实现
        System.out.println("抽象工厂方式");
        AnimalsFactory factory2 = new AnimalsFactory();
        Animal bird = factory2.getBird();
        bird.voice();
    }
}
