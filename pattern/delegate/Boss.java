package pattern.delegate;

public class Boss {
    //boss跟leader的交互，屏蔽了任务分发过程，leader只需交付结果
    void doSometingng(Leader l){
        l.delegate();
    }
}
