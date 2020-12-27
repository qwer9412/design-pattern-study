package iterator;

public class Main {
	public static void main(String args[]) {
		BookShelf bookShelf = new BookShelf();
		bookShelf.appnedBook(new Book("a"));
		bookShelf.appnedBook(new Book("b"));
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
