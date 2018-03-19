package pattern.delegate;

public class Bworker implements Worker {
    @Override
    public void work() {
        System.out.println("B do B");
    }
}
