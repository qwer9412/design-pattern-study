package iterator;

public class Main {
	public static void main(String args[]) {
		MyClass a = new MyClass();
		a.appned("a");
		a.appned("b");
		
		MyClassIterator it = a.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}
}
