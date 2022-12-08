package pkg_book;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BookManager {
	ObjectOutputStream oos_book = null;
	ObjectInputStream ois_book = null;
	
	File book_file = new File("Book.dat");
	
	ArrayList<Book> book_list = null;

	public BookManager(ObjectOutputStream oos_book, ObjectInputStream ois_book, File book_file,
			ArrayList<Book> book_list) {
		super();
		this.oos_book = oos_book;
		this.ois_book = ois_book;
		this.book_file = book_file;
		this.book_list = book_list;
	}

	public BookManager() {
		super();
	}
	
	public void addABook(Book book) {
		book_list.add(book);
	}
	
	public void viewAllBook() {
		for(Book book:book_list)
			System.out.print(book);
	}

	public Book searchBookByIsbn(int search_isbn) {
		for (Book book:book_list) {
			if (book.getIsbn() == search_isbn)
				return book;
		}
		return null;
		}
	
	public boolean deleteBook(int delete_isbn) {
		return false;
	}

	public void listBooksBySubject1(String search_subject) {
		// TODO Auto-generated method stub
		
	}

	public void listBooksBySubject(String search_subject) {
		// TODO Auto-generated method stub
		
	}
}









