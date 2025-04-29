package com.TCS.Library.Management.System.Entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "borrow")
public class Borrow {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int borrowId;
	private Date borrowDate;
	private Date returnDate;
	private Date dueDate;
	
	@ManyToOne
	@JsonBackReference("book-borrow")
	@JoinColumn(name = "book_id")
	private Book book;
	
	@ManyToOne
	@JsonBackReference("borrow-user")
	@JoinColumn(name = "user_id")
	private Users user;
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public int getBorrowId() {
		return borrowId;
	}
	public void setBorrowId(int borrowId) {
		this.borrowId = borrowId;
	}
	public Date getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Borrow() {
		super();
	}
	public Borrow(int borrowId, Date borrowDate, Date returnDate, Date dueDate, Book book, Users user) {
		super();
		this.borrowId = borrowId;
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
		this.dueDate = dueDate;
		this.book = book;
		this.user = user;
	}
	
}
