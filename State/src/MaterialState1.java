
public class MaterialState1 implements MaterialState {
	
	private static MaterialState1 instance = new MaterialState1();
	
	private MaterialState1() {
	}
	
	public static MaterialState1 getInstance() {
		return instance;
	}

	@Override
	public void speakState() {
		System.out.println("����1 �Դϴ�.");
	}

	@Override
	public void speakFeature() {
		System.out.println("Ư¡1 �Դϴ�.");
	}
}
