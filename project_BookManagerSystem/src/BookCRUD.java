import java.util.List;

public interface BookCRUD {
    void create(Book book);
    List<Book> readAll();
    Book readById(String id);
    boolean delete(String id);
}