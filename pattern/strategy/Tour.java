package pattern.strategy;

public class Tour {
    public OutState tour(ToolType type){
        OutState state = type.getTool().move();
        return state;
    }
}
