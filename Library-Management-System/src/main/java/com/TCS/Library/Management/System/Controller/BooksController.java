package com.TCS.Library.Management.System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TCS.Library.Management.System.Entity.Book;
import com.TCS.Library.Management.System.Service.BookService;

@RestController
@RequestMapping("admin/book")

public class BooksController {

    @Autowired
    BookService bookService ;
    
    @GetMapping
    public String getMethod() {
		return "...........All Book handled by admin..........  ";
	}
	
//create	
	@PostMapping ("create")
	public  String postStudent(@RequestBody Book book) {
		
		return bookService.addBook(book) ;
	}
	
//read
	
	@GetMapping("readAll")                                        //to read all
	public List<Book> getMethod1() {
		
		return bookService.readAllBooks();
	}
	
	@GetMapping("read/{id}")                                 //to read by Id
	public Book getMethod2(@PathVariable int bookId) {
		
		return bookService.readBook(bookId);
	}
	
//update
	
	@PutMapping("update/{id}")
	public String putBookEntity(@PathVariable int id,@RequestBody Book book) {
		
		return bookService.updateBook(id,book);
	}
	
//delete
	
	@DeleteMapping("delete/{id}")
	public String deleteBook(@PathVariable int id) {
		
		return bookService.deleteBook(id);
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllBooks() {
		
		return bookService.deleteAllBooks();
	}
	 
}