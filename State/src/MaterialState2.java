
public class MaterialState2 implements MaterialState {

	private static MaterialState2 instance = new MaterialState2();
	
	private MaterialState2() {
	}
	
	public static MaterialState2 getInstance() {
		return instance;
	}

	@Override
	public void speakState() {
		System.out.println("상태2 입니다.");
	}

	@Override
	public void speakFeature() {
		System.out.println("특징2 입니다.");
	}
}
