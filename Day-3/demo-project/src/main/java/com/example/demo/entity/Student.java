package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")

public class Student {
	@Id
	@Column(name="id")
	@GeneratedValue
	private int id;
	
	@Column(name="Name")
	private String name;
	
	public Student() {};
	public Student(int id,String name)
	{
		super();
		this.id = id;
		this.name=name;
	}
	
	public int getid()
	{
		return id;
	}
	public void setid(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}