import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Route {
	
	private String route;
	private int needTime;
	
	private Route(String route, int needTime) {
		this.route = route;
		this.needTime = needTime;
	}
	
	public String getRoute() {
		return route;
	}
	
	public int getNeedTime() {
		return needTime;
	}
	
	public static List<Route> searchByAddress(String start, String end) {

		Random random = new Random();
		List<Route> routeList = new ArrayList<>();
		for (int i=0;i<10;i++) {
			String route = "route" + i;
			int needTime = random.nextInt(100);
			
			routeList.add(new Route(route, needTime));
		}
		
		return routeList;
	}
}
