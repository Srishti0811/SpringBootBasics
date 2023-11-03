package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//below generates the object - getbean
@Component
//@Scope(value = "prototype") //in case of prototype it will only create a object when we use the get bean method
//in case of singleton - when the spring container - context is created.
public class Laptop {

	private String name;
	private double screenSize;
	
	//below used to link dependecy to another class
	@Autowired //Uses class name (de captalized)
	/* 
	 * //Below can be used if you want to call by specifying a diff name - need to
	 * mention next to @component too.
	 * 
	 * @Qualifier("HD")
	 */
	
	private HardDisk hd;
	
	//To demonstrate a singleton approach:
	public Laptop() {
		super();
		System.out.println("Created a laptop object");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	
	
	public HardDisk getHd() {
		return hd;
	}
	public void setHd(HardDisk hd) {
		this.hd = hd;
	}
	
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", screenSize=" + screenSize + "]";
	}
	
	
	public void show() {
		System.out.println("In Laptop Class");
		hd.show();
	}
	
}
