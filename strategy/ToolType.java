package strategy;

public enum ToolType {
    Car(new Car()),Boat(new Boat());
    private TourTool tool;
    private ToolType(TourTool tool){
        this.tool = tool;
    }

    public TourTool getTool() {
        return tool;
    }

    public void setTool(TourTool tool) {
        this.tool = tool;
    }
}
