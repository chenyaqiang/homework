package pattern.delegate;

public class DelegateTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.doSometingng(new Leader());
    }
}
