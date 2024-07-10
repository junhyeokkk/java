package sub2;

public class Book {
	
	private String title;
	private String author;
	private String isbn;
	private int availableCopies;
	
	// 생성자 정의
	public Book(String title, String author, String isbn, int availableCopies) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.availableCopies = availableCopies;
	}
	// 각 인스턴수 변수에 대한 Getter, Setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAvailableCopies() {
		return availableCopies;
	}

	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}
	
	// 이용가능한 복사본이 있으면 availableCopies 감소 + true 반환 아니면 false 반환하는 borrowBook()메서드
	public boolean borrowBook() {
		if(availableCopies > 0) {
			availableCopies--;
			return true;
		}
		else {
			return false;
		}
	}
	// availableCopies 1증가시키는 메서드
	public void returnBook() {
		availableCopies++;
	}
	
	// 모든 인스턴스 변수를 출력
	public void show() {
		System.out.println("책 제목 :" + title);
		System.out.println("저자 이름 :" + author);
		System.out.println("ISBN 번호 :" + isbn);
		System.out.println("이용 가능한 복사본 수 :" + availableCopies);
	}
}
