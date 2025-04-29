package com.TCS.Library.Management.System.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int bookId;
	    private String title;
	    private String author;
	    private int noOfCopies;
	    private boolean availability;
	    
	    @OneToMany(mappedBy = "book",cascade = CascadeType.ALL)
	    @JsonManagedReference("book-borrow")
	    private List<Borrow> borrow;
	    
		public List<Borrow> getBorrow() {
			return borrow;
		}
		public void setBorrow(List<Borrow> borrow) {
			this.borrow = borrow;
		}
		public int getBookId() {
			return bookId;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getNoOfCopies() {
			return noOfCopies;
		}
		public void setNoOfCopies(int noOfCopies) {
			this.noOfCopies = noOfCopies;
		}
		public boolean isAvailability() {
			return availability;
		}
		public void setAvailability(boolean availability) {
			this.availability = availability;
		}
		public Book(int bookId, String title, String author, int noOfCopies, boolean availability,List<Borrow> borrow) {
			super();
			this.bookId = bookId;
			this.title = title;
			this.author = author;
			this.noOfCopies = noOfCopies;
			this.availability = availability;
			this.borrow=borrow;
		}
		public Book() {
			super();
		}
	    
	    
}
