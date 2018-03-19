package pattern.adapter;

public enum LoginType {
    LOGIN_QQ(new QQlogin()),LOGIN_WECHAT(new WetcatLogin());
    LoginService loginService;
    LoginType (LoginService service){
        loginService = service;
    }
}
