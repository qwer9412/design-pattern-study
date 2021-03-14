
public class MaterialState2 implements MaterialState {

	private static MaterialState2 instance = new MaterialState2();
	
	private MaterialState2() {
	}
	
	public static MaterialState2 getInstance() {
		return instance;
	}

	@Override
	public void speakState() {
		System.out.println("����2 �Դϴ�.");
	}

	@Override
	public void speakFeature() {
		System.out.println("Ư¡2 �Դϴ�.");
	}
}
