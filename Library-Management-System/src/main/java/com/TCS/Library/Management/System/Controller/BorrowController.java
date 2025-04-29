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

import com.TCS.Library.Management.System.Entity.Borrow;
import com.TCS.Library.Management.System.Service.BorrowService;

@RestController
@RequestMapping("borrow")
public class BorrowController {
	
	@Autowired
	BorrowService borrowService;

	@GetMapping
    public String getMethod() {
		return "...........Borrow..........  ";
	}
	
//create	
	@PostMapping ("create")
	public  String postBorrow(@RequestBody Borrow borrow) {
		
		return borrowService.addBorrow(borrow) ;
	}
	
//read
	
	@GetMapping("readAll")                                        //to read all
	public List<Borrow> getMethod1() {
		
		return borrowService.readAllBorrow();
	}
	
	@GetMapping("read/{id}")                                 //to read by Id
	public Borrow getMethod2(@PathVariable int id) {
		
		return borrowService.readBorrow(id);
	}
	
//update
	
	@PutMapping("update/{id}")
	public String putBorrow(@PathVariable int id,@RequestBody Borrow borrow) {
		
		return borrowService.updateBorrow(id,borrow);
	}
	
//delete
	
	@DeleteMapping("delete/{id}")
	public String deleteBorrow(@PathVariable int id) {
		
		return borrowService.deleteBorrow(id);
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllBorrows() {
		
		return borrowService.deleteAllBorrows();
	}
	
}
