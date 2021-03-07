
public class Note {
	
	private String text = "";
	
	public void addText(String newText) {
		text += newText;
	}
	
	public Memento makeMemento() {
		return new Memento(text);
	}
	
	public void undo(Memento memento) {
		this.text = memento.getText();
	}
	
	public String getText() {
		return this.text;
	}
}
