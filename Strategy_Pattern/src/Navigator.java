
public class Navigator {
    RouteStrategy routeStrategy;

    Navigator(RouteStrategy r) {
        routeStrategy = r;
    }

    void setRouteStrategy(RouteStrategy r) {
        routeStrategy = r;
    }

    void buildRoute(int a, int b) {
        routeStrategy.buildRoute(a, b);
    }
}
