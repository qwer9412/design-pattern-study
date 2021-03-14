import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Material material = new Material();
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			
			material.setState(random.nextInt());
			material.speakState();
			material.speakFeture();
		}
	}

}
