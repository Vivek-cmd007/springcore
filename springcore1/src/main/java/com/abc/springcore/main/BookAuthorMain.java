package com.abc.springcore.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.abc.springcore.bean.Book;
import com.abc.springcore.bean.Author;
public class BookAuthorMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("mycontext.xml");

		Book book = (Book) context.getBean("book1");
		
		System.out.println("BookDetails:");
		System.out.println("BookName:"+book.getBookName());
		System.out.println("BookPrice:"+book.getBookPrice());
	
		Author author= book.getBookAuthor();
		System.out.println("Author Details:");
		System.out.println("AuthorName: "+author.getAuthorName());
		System.out.println("AuthorEmail: "+author.getEmail());
		
		context.close();
	}

}
