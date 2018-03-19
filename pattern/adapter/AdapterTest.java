package pattern.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        LoginAdapter adapter = new LoginAdapter();
        adapter.login(LoginType.LOGIN_QQ);
        adapter.login(LoginType.LOGIN_WECHAT);
    }
}
