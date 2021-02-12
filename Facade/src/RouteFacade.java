import java.util.List;

public class RouteFacade {
	public static int getMinimumNeedTime(int startX, int startY, int endX, int endY) {
		String start = XYConverter.toAddress(startX, startY);
		String end = XYConverter.toAddress(endX, endY);
		
		List<Route> routeList = Route.searchByAddress(start, end);
		
		RouteSelector routeSelector = new RouteSelector(routeList);
		Route minimumNeedTimeRoute =  routeSelector.getShortestNeedTimeRoute();
		
		return minimumNeedTimeRoute.getNeedTime();
	}
}
