package com.TCS.Library.Management.System.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.TCS.Library.Management.System.Entity.Borrow;

@Service
public interface IBorrowService {
	
	//crud
    
	public String addBorrow(Borrow borrow);           //Create
	
	public Borrow  readBorrow(int id);                 //ReadById
	public List<Borrow> readAllBorrow();                 //ReadAll
	
	public String updateBorrow(int id,Borrow borrow);   //updateById in Table
	
	public String deleteBorrow(int id);                   //deleteById
	public String deleteAllBorrows();               //deleteAll


}
