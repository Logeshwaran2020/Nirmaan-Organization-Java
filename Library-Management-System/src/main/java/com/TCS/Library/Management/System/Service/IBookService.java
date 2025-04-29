package com.TCS.Library.Management.System.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.TCS.Library.Management.System.Entity.Book;


@Service
public interface IBookService {
	//crud
    
	public String addBook(Book book);           //Create
	
	public Book  readBook(int id);                 //ReadById
	public List<Book> readAllBooks();                 //ReadAll
	
	public String updateBook(int id,Book book);   //updateById in Table
	
	public String deleteBook(int id);                   //deleteById
	public String deleteAllBooks();               //deleteAll


}
