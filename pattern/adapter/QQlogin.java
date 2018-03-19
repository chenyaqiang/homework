package pattern.adapter;

public class QQlogin implements LoginService {
    @Override
    public void login() {
        System.out.println("qq登录,返回凭证信息");
    }
}
