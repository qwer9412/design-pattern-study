import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Note note = new Note();
		Stack<Memento> stack = new Stack<>();
		
		boolean doText = true;
		while (doText) {
			char order = sc.next().charAt(0);

			switch (order) {
			case 'a':
				String text = sc.next();
				note.addText(text);
				break;
				
			case 's':
				stack.add(note.makeMemento());
				break;
				
			case 'u':
				if (!stack.empty()) {
					note.undo(stack.pop());
				}
				break;
				
			case 'p':
				System.out.println(note.getText());
				break;
				
			case 'e':
				doText = false;
				break;
			}
		}
	}

}
