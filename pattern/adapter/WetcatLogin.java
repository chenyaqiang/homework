package pattern.adapter;

public class WetcatLogin implements LoginService {
    @Override
    public void login() {
        System.out.println("微信登录，返回登录信息");
    }
}
