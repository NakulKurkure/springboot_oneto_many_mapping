package com.springonetomany.controller;

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

import com.springonetomany.entities.product;
import com.springonetomany.service.productService;

@RestController
@RequestMapping("/product")
public class productController {

	@Autowired
	private productService ps; 
	
	//Add product
	@PostMapping("/api/products")//1
	private product add(@RequestBody product p)
	{
		return ps.addorupdate(p);
	}
	
	@GetMapping("/api/products")//////
	public List<product> getAll()
	{
		return ps.getAll();
	}
	
	@GetMapping("/api/products/{id}")//////
	public product getById(@PathVariable int id) {
		return ps.getById(id);//return cs.getById(id);
	}
	
	@PutMapping("/api/products/{id}")//2
	public product update(@PathVariable int id,   @RequestBody product p)
	{
		p.setpId(id);
		return ps.addorupdate(p);
	}
	
	@DeleteMapping("/api/products/{id}")///////
	public void delete(@PathVariable int id)
	{
		ps.delete(id);
		
	}
	
}

