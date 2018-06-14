package chap10.decorator._02.resolved02;

public class Client {
    public static void main(String[] args) {
        Display road = new RoadDisplay();
        road.draw();

        Display roadWithLane = new LaneDecorator(new RoadDisplay());
        roadWithLane.draw();

        Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
        roadWithTraffic.draw();

        Display roadWithCrossing = new CrossingDecorator(new RoadDisplay());
        roadWithCrossing.draw();

        Display roadWithLaneTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
        roadWithLaneTraffic.draw();

        Display roadWithLaneCrossing = new CrossingDecorator(new LaneDecorator(new RoadDisplay()));
        roadWithLaneCrossing.draw();

        Display roadWithTrafficCrossing = new CrossingDecorator(new TrafficDecorator(new RoadDisplay()));
        roadWithTrafficCrossing.draw();

        Display roadWithLaneTrafficCrossing = new CrossingDecorator(new TrafficDecorator(new LaneDecorator(new RoadDisplay())));
        roadWithLaneTrafficCrossing.draw();
    }
}