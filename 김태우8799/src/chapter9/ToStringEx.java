package chapter9;

class Book {
	int bookNumber;
	String bookTitle;
	public Book(int bookNumber, String bookTitle) {
	this.bookNumber = bookNumber;
	this.bookTitle = bookTitle;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bookNumber + " < " + bookTitle + " > ";
	}
}

public class ToStringEx{
	public static void main(String[] args) {
		Book b1 = new Book(100, "명품 자바");
		 Book b2 = new Book(101, "자바 프로그래밍 입문서");
		 Book b3 = new Book(102, "자바의 정석");
		 Book b4 = new Book(103, "Do it 자바 프로그래밍");
		 
		 System.out.println(b1);
		 System.out.println(b2);
		 System.out.println(b3);
		 System.out.println(b4);
	} 

	 
}
