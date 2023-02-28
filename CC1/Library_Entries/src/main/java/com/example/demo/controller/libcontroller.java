package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.libentity;
import com.example.demo.service.libservice;

@RestController
public class libcontroller {

	@Autowired
	private libservice libs;
	
	@PostMapping("/add")
	public String postlibs (@RequestBody libentity s){

		libs.saveDetails(s);
		return "Value added";

	}

	@GetMapping ("/get/page={page}/size={size}")
	public List<libentity>getlibs(
								  @PathVariable("page") int page, 
								  @PathVariable("size") int size
								  )
	{

	return libs.getDetails(page, size);

	}

	@PutMapping("/update")
	public String updatelibs (@RequestBody libentity s){

		libs.updatedetail(s);
		return "Value updated";

	}

	@DeleteMapping("/delete/{s}")
	public String deletelibs (@PathVariable int s){

		libs.deletedetail(s);
		return "Value deleted";

	}

}
