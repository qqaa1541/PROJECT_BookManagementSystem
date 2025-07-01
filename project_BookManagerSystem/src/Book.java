public class Book {
    private String id;
    private String title;
    private String author;

    // 생성자
    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // Getter
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // 문자열로 출력할 때 보기 좋게 출력
    @Override
    public String toString() {
        return "[ID: " + id + ", 제목: " + title + ", 저자: " + author + "]";
    }
}