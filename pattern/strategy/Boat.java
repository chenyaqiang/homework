package pattern.strategy;

public class Boat implements TourTool {
    @Override
    public OutState move() {
        System.out.println("欢迎上船");
        try {
            Thread.sleep(1000);
            state.setMsg("成功到岸");
            state.setState(0);
            return state;
        } catch (InterruptedException e) {
            e.printStackTrace();
            state.setState(1);
            state.setMsg("翻船了");
            return state;
        }
    }
}
