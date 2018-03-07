package factorydesign.product;

public class Bird implements Animal {
    @Override
    public void voice() {
        System.out.println("it's a bird !");
    }
}
