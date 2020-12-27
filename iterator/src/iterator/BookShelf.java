package iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggreation {
	private List<Book> books;
	
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public Book getBook(int idx) {
		return books.get(idx);
	}
	
	public void appnedBook(Book book) {
		if (books == null) {
			books = new ArrayList();
		}
		
		books.add(book);
	}

	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
	
}
