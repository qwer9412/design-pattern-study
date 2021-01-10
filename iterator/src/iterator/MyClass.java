package iterator;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
	private List<String> sentents;
	
	public List<String> getSentents() {return sentents;}
	public void setSentents(List<String> sentents) {this.sentents = sentents;}
	public String getSentent(int idx) {return sentents.get(idx);}
	
	public void appned(String str) {
		if (sentents == null) {
			sentents = new ArrayList();
		}
		
		sentents.add(str);
	}

	public MyClassIterator iterator() {
		return new MyClassIterator(this);
	}
}
