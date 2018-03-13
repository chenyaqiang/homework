package strategy;

public class Car implements TourTool {
    @Override
    public OutState move() {
        System.out.println("欢迎坐汽车");
        try {
            Thread.sleep(1000);
            state.setState(0);
            state.setMsg("成功到达");
            return state;
        } catch (InterruptedException e) {
            e.printStackTrace();
            state.setState(1);
            state.setMsg("翻车了");
            return state;
        }
    }
}
