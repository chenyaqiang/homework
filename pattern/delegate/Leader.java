package pattern.delegate;

public class Leader {
    Aworker aworker = new Aworker();
    Bworker bworker = new Bworker();
    void delegate(){//把收到的任务分解委派给不同功能单元去完成
        System.out.println("ok ,let's do it");
        //分配任务A
        aworker.work();
        //分配任务B
        bworker.work();

    }
}
