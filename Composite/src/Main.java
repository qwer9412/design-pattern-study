
public class Main {

	public static void main(String[] args) {
		Plate rootPlate = new Plate("rootPlate");
		Plate plate1 = new Plate("plate1");
		Plate plate2 = new Plate("plate2");
		rootPlate.add(plate1);
		rootPlate.add(plate2);
		
		plate1.add(new Food("food1", 1));
		plate1.add(new Food("food2", 2));
		
		plate2.add(new Food("food3", 3));
		
		Plate plate2_1 = new Plate("plate2-1");
		plate2_1.add(new Food("food4", 4));
		plate2.add(plate2_1);
		
		System.out.println(rootPlate.getWeight());
		rootPlate.showList();
	}

}
