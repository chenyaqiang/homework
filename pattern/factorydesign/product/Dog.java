package pattern.factorydesign.product;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("it's a dog !");
    }
}
