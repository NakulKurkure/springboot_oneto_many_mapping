package com.springonetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springonetomany.entities.category;
//import com.springonetomany.entities.product;
@Repository
public interface categoryRepo extends JpaRepository<category, Integer>{

}
