package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="library")

public class libentity {

	@Column(name = "sname")
	private String name;
	
	@Id
	@Column(name = "rollnum")
	private int rollnum;
	
	@Column(name = "intime")
	private int intime;
	
	@Column(name = "outtime")
	private int outtime;
	
	@Column(name = "netusage")
	private int netusage;
	
	public libentity() {};
	
	public libentity(String name, int rollnum, int intime, int outtime, int netusage){
		super();
		this.name=name;
		this.rollnum=rollnum;
		this.intime=intime;
		this.outtime=outtime;
		this.netusage =netusage;
	}
	
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	
	public int getrollnum()
	{
		return rollnum;
	}
	public void setid(int rollnum)
	{
		this.rollnum = rollnum;
	}
	
	public int getintime()
	{
		return intime;
	}
	public void setintime(int intime)
	{
		this.intime = intime;
	}
	
	public int getouttime()
	{
		return outtime;
	}
	public void setouttime(int outtime)
	{
		this.outtime = outtime;
	}
	
	public int getnetusage()
	{
		return netusage;
	}
	public void setnetusage(int netusage)
	{
		this.netusage = netusage;
	}
}
