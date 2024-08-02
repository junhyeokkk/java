package test04;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowd;
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowd = false;
	}

	public String getTitle() {
		return title;
	}
	
	public void borrowBook() {
		if(this.isBorrowd == false) {
			System.out.println("도서대출 : "+this.title);
			isBorrowd = true;
		} else {
			System.out.println(this.title+"  이미 대출됨");
		}
	}
	
	public void returnBook() {
		if(this.isBorrowd == true) {
			System.out.println("도서반납 : "+this.title);
			isBorrowd = false;
		} else {
			System.out.println(this.title+"  이미 반납됨");
		}
	}

	public void getBookInfo() {
		System.out.println("도서명 : "+this.title);
		System.out.println("저자 : "+this.author);
		System.out.println("ISBN : "+this.isbn);
		if(this.isBorrowd == false) {
			System.out.println("대출여부 : 가능");
		} else {
			System.out.println("대출여부 : 불가능");
		}
		
	}
	
}
