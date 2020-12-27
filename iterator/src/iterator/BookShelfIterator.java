package iterator;

public class BookShelfIterator implements Iterator {
	
	private BookShelf bookShelf;
	private int idx;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.idx = 0;
	}

	@Override
	public boolean hasNext() {
		return bookShelf.getBooks().size() > idx;
	}

	@Override
	public Book next() {
		Book book = bookShelf.getBook(idx);
		idx++;
		return book;
	}

}
