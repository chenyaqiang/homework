package pattern.template;

public class Cooking {
    void cook (DIY diy){
        //1洗菜
        wash();
        //2点火
        fire();
        //3具体烹饪操作，固定流程中参与操作的部分变动处
        diy.doit();
        //4起锅
        get();
        //5开吃
        eat();
    }

    private void eat() {
        System.out.println("开吃");
    }

    private void get() {
        System.out.println("起锅");
    }

    private void fire() {
        System.out.println("点火");
    }

    private void wash() {
        System.out.println("洗菜");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
