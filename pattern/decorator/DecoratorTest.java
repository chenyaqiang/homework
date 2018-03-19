package pattern.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        DecoratorLogin decoratorLogin = new DecoratorLogin(new BaseLogin());
        decoratorLogin.login("xyc","123");
    }
}
