
public class MaterialState1 implements MaterialState {
	
	private static MaterialState1 instance = new MaterialState1();
	
	private MaterialState1() {
	}
	
	public static MaterialState1 getInstance() {
		return instance;
	}

	@Override
	public void speakState() {
		System.out.println("상태1 입니다.");
	}

	@Override
	public void speakFeature() {
		System.out.println("특징1 입니다.");
	}
}
