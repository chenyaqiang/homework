package strategy;

public interface TourTool {
    OutState state = new OutState();
    OutState  move();
}
