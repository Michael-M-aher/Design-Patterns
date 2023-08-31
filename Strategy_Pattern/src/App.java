public class App {
    public static void main(String[] args) throws Exception {
        Navigator navigator = new Navigator(new WalkingStrategy());
        navigator.setRouteStrategy(new RoadStrategy());
        navigator.buildRoute(0, 0);
    }
}
