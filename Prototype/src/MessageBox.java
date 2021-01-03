
public class MessageBox implements Product {

	private char decochar;

	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	@Override
	public void use(String s) {
		int len = s.getBytes().length;

		for (int i = 0; i < len + 2; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar + s + decochar);
		for (int i = 0; i < len + 2; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
	}

	@Override
	public Product createClone() {
		Product result = null;;
		try {
			result = (Product)clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
