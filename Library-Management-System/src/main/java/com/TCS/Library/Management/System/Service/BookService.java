package com.TCS.Library.Management.System.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TCS.Library.Management.System.Entity.Book;
import com.TCS.Library.Management.System.Repository.IBookRepository;

@Service

public class BookService implements IBookService{
	@Autowired
	IBookRepository bookRepository;

	@Override
	public String addBook(Book book) {
		bookRepository.save(book);
		return "Added Book";
	}

	@Override
	public Book readBook(int id) {
		return bookRepository.findById(id).get();
	}

	@Override
	public List<Book> readAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public String updateBook(int id, Book book) {
		book.setBookId(id);
		bookRepository.save(book);
		return "Book Id : "+id +" is Updated Successfully";
	}

	@Override
	public String deleteBook(int id) {
		bookRepository.deleteById(id);
		return "Book Id : "+id+" is deleted!";
	}

	@Override
	public String deleteAllBooks() {
		bookRepository.deleteAll();
		return "All books are deleted.";
	}

}
