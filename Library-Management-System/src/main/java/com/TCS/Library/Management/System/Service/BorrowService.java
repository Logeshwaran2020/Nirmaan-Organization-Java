package com.TCS.Library.Management.System.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TCS.Library.Management.System.Entity.Borrow;
import com.TCS.Library.Management.System.Repository.IBorrowRepository;

@Service
public class BorrowService implements IBorrowService{ 
	@Autowired
	IBorrowRepository borrowRepository;
	
	@Override
	public String addBorrow(Borrow borrow) {
		borrowRepository.save(borrow);
		return "Added";
	}

	@Override
	public Borrow readBorrow(int id) {
		return borrowRepository.findById(id).get();
	}

	@Override
	public List<Borrow> readAllBorrow() {
		return borrowRepository.findAll();
	}

	@Override
	public String updateBorrow(int id, Borrow borrow) {
		borrow.setBorrowId(id);
		borrowRepository.save(borrow);
		return "Updated";
	}

	@Override
	public String deleteBorrow(int id) {
		borrowRepository.deleteById(id);
		return "Borrow Id : "+id+" is deleted ";
	}

	@Override
	public String deleteAllBorrows() {
		borrowRepository.deleteAll();
		return "All borrows are deleted.";
	}


}