package strategy;

public class OutState {
    private int state;
    private String msg;

    @Override
    public String toString() {
        return "出行状态:"+state+"\n出行消息："+msg;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
