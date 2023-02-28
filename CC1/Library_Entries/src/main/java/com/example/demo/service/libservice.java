package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.libentity;
import com.example.demo.repository.librepo;

@Service
public class libservice {

	@Autowired
	private librepo libr;
	
	public libentity saveDetails(libentity s) {
		return libr.save(s);
	}

	public List<libentity> getDetails(int page, int size) {
		Pageable pageable = PageRequest.of(page, size);
		Page<libentity> pageResult = libr.findAll(pageable);
		return pageResult.toList();
	}

	public libentity updatedetail(libentity s) {
		return libr.saveAndFlush(s);
	}

	public int deletedetail(int s) {
		libr.deleteById(s);
		return s;
	}

}
