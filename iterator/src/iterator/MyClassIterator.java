package iterator;

public class MyClassIterator {
	
	private MyClass myClass;
	private int idx;
	
	public MyClassIterator(MyClass myClass) {
		this.myClass = myClass;
		this.idx = 0;
	}

	public boolean hasNext() {
		return myClass.getSentents().size() > idx;
	}

	public String next() {
		String str = myClass.getSentent(idx);
		idx++;
		return str;
	}
}
