package com.springonetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springonetomany.entities.category;
import com.springonetomany.entities.product;
import com.springonetomany.repository.categoryRepo;
import com.springonetomany.repository.productRepo;

@Service
public class categoryService {

	
	@Autowired
	private categoryRepo cr;  //connect to the DB
	
	public category addorupdate(category c)
	{
		return cr.save(c);
	}
	
	public boolean delete(int id)
	{
		cr.deleteById(id);
		return true;
	}
	
	public List<category> getAll()
	{
		return cr.findAll();
	}
	
	public category getById(int id) {
		return cr.findById(id).get();
	}

//	public category addorupdate1(category c)
//	{
//		return cr.save(c);
//	}
//	public Object findById(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	public category save(category c) {
//		// TODO Auto-generated method stub
//		return cr.save(c);
//	}
	
}

