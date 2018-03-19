package pattern.adapter;
//保留原来的登录不变，进行增加但兼容了原来登录
public class LoginAdapter {
    private Login login = new Login();//注入以前的登录，与之前对象没有层级关系，不一定同源
    void login(LoginType type){
        type.loginService.login();
        login.login();
    }
    void login(){//兼容以前登录
        login.login();
    }
}
