package template;
//模板方法模式，对于一个业务流程除了参与的部分细节可调节其他都是固定形式的，可看成一个标准模板，把参与部分单独抽出在修改
public class TemplateTest {
    public static void main(String[] args) {
        //做饭流程可视为一个固定模板
        Cooking cook = new Cooking();
        //传入已有的操作
        cook.cook(new Duntang());
        //匿名内部类方式
        cook.cook(new DIY() {
            @Override
            public void doit() {
                System.out.println("在固定流程模板中参与的部分单独提取出");
            }
        });
    }
}
