package com.springonetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springonetomany.entities.product;
import com.springonetomany.repository.productRepo;

@Service
public class productService {

	@Autowired
	private productRepo pr;
	
	
	public product addorupdate(product p)
	{
		return pr.save(p);
	}
	
	public boolean delete(int id)
	{
		pr.deleteById(id);
		return true;
	}
	
	
	public List<product> getAll()
	{
		return pr.findAll();
	}
	
	public product getById(int id) {
		return pr.findById(id).get();//return cr.findById(id).get();
	}
	
	
}
