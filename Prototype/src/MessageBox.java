
public class MessageBox implements Cloneable{

	private char decochar;

	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	public void use(String s) {
		System.out.println(decochar + s + decochar);
	}

	public MessageBox createClone() {
		MessageBox result = null;;
		try {
			result = (MessageBox)clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
