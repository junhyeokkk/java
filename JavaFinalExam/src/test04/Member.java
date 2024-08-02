package test04;

import test04.Book;

public class Member {
	private String name;
	private String memberId;
	private Book borrowedBook;
	public Member(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
		this.borrowedBook = null;
	}
	
	public void borrowBook(Book book) {
		book.borrowBook();
		this.borrowedBook = book;
	}
	
	public void returnBook(Book book) {
		book.returnBook();
		this.borrowedBook = null;
	}
	
	public void getMemberInfo() {
		System.out.println("회원명 : "+this.name);
		System.out.println("아이디 : "+this.memberId);
		if(borrowedBook == null) {
			System.out.println("대출한 도서 : 없음");
		} else {
			System.out.println("대출한 도서 : " +this.borrowedBook.getTitle());
		}
		
	}
}
