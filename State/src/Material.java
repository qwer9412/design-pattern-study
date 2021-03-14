
public class Material {

	private MaterialState state;
	
	public void setState(int num) {
		if (num % 2 == 0) {
			state = MaterialState1.getInstance();
		} else {
			state = MaterialState2.getInstance();
		}
	}
	
	public void speakState() {
		state.speakState();
	}
	
	public void speakFeture() {
		state.speakFeature();
	}
}
