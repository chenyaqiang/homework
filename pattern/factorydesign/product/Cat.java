package pattern.factorydesign.product;

public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("it's a cat !");
    }
}
