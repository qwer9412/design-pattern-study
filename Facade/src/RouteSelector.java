import java.util.List;

public class RouteSelector {
	private List<Route> routeList;

	public RouteSelector(List<Route> routeList) {
		this.routeList = routeList;
	}

	public Route getShortestNeedTimeRoute() {
		Route shortestRoute = routeList.get(0);
		for (int i = 1; i < routeList.size(); i++) {
			if (shortestRoute.getNeedTime() > routeList.get(i).getNeedTime()) {
				shortestRoute = routeList.get(i);
			}
		}
		
		return shortestRoute;
	}
}
