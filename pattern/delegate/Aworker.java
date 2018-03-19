package pattern.delegate;

public class Aworker implements Worker {
    @Override
    public void work() {
        System.out.println("A do A");
    }
}
