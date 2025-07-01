import java.util.*;

public class BookManager implements BookCRUD {
    private Map<String, Book> bookMap = new HashMap<>();

    @Override
    public void create(Book book) {
        bookMap.put(book.getId(), book);
    }

    @Override
    public List<Book> readAll() {
        return new ArrayList<>(bookMap.values());
    }

    @Override
    public Book readById(String id) {
        return bookMap.get(id);
    }

    @Override
    public boolean delete(String id) {
        return bookMap.remove(id) != null;
    }
}