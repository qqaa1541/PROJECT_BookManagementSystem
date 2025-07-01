import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookManager manager = new BookManager();

        while (true) {
            System.out.println("\n1. 등록  2. 목록  3. 검색  4. 삭제  5. 종료");
            System.out.print("메뉴 선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 제거

            switch (choice) {
                case 1:
                    System.out.print("도서 ID: ");
                    String id = scanner.nextLine();
                    System.out.print("제목: ");
                    String title = scanner.nextLine();
                    System.out.print("저자: ");
                    String author = scanner.nextLine();
                    manager.create(new Book(id, title, author));
                    break;
                case 2:
                    for (Book book : manager.readAll()) {
                        System.out.println(book);
                    }
                    break;
                case 3:
                    System.out.print("검색할 도서 ID: ");
                    String searchId = scanner.nextLine();
                    Book found = manager.readById(searchId);
                    System.out.println(found != null ? found : "해당 도서를 찾을 수 없습니다.");
                    break;
                case 4:
                    System.out.print("삭제할 도서 ID: ");
                    String deleteId = scanner.nextLine();
                    boolean removed = manager.delete(deleteId);
                    System.out.println(removed ? "삭제 성공" : "삭제 실패 (해당 ID 없음)");
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}