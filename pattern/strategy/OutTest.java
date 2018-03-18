package pattern.strategy;
//决策模式，顾名思义是一种在完成业务过程对可替换的多个固定的方法间做出选择的行为模式，
// 方法的具体操作不关心，只需选择以取得最终结果
public class OutTest {
    public static void main(String[] args) {
        Tour tour = new Tour();
        System.out.println(tour.tour(ToolType.Car));
    }
}
