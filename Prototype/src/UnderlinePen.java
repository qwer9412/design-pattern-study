
public class UnderlinePen implements Product {

	private char ulchar;

	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}

	@Override
	public void use(String s) {
		System.out.println(s);
		int len = s.getBytes().length;
		for (int i = 0; i < len; i++) {
			System.out.print(ulchar);
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
