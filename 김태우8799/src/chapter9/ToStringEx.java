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
		Book b1 = new Book(100, "��ǰ �ڹ�");
		 Book b2 = new Book(101, "�ڹ� ���α׷��� �Թ���");
		 Book b3 = new Book(102, "�ڹ��� ����");
		 Book b4 = new Book(103, "Do it �ڹ� ���α׷���");
		 
		 System.out.println(b1);
		 System.out.println(b2);
		 System.out.println(b3);
		 System.out.println(b4);
	} 

	 
}
