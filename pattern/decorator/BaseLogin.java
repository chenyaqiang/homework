package pattern.decorator;

public class BaseLogin implements Login {
    @Override
    public void login(String username, String password) {
        System.out.println("以前的登录逻辑");
    }
}
