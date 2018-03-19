package pattern.decorator;

public class DecoratorLogin implements LoginEX {//跟源对象还是同一类，有层级关系
    private BaseLogin baseLogin;
    DecoratorLogin(BaseLogin login){
        this.baseLogin = login;
    }
    @Override
    public void login(String username, String password) {
        System.out.println("包装逻辑");//在原逻辑基础上进行包装增强，扩展功能
        baseLogin.login(username,password);
    }
}
