package com.jspiders.garbage.example;

public class Book {

	int bookid;
	String bookname, authorname;

	public void read() {
		System.out.println("Harry porter this book have total 7 editions");
	}

	public Book(int bookid, String bookname, String authorname) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.authorname = authorname;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("object deleted finalize method called");

	}

	public static void main(String[] args) {

		Book obj = new Book(01, "Harry porter", "Hememdra");
		System.out.println(obj);

	}
}
