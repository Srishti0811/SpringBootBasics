package com.example.demo;

import org.springframework.stereotype.Component;

@Component /* ("HD")  - in case of @Qualifier*/
public class HardDisk {

	private String name;
	private double hdSize;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHdSize() {
		return hdSize;
	}
	public void setHdSize(double hdSize) {
		this.hdSize = hdSize;
	}
	
	@Override
	public String toString() {
		return "HardDisk [name=" + name + ", hdSize=" + hdSize + "]";
	}
	
	public void show() {
		System.out.println("In HardDisk class");
	}
	
}
