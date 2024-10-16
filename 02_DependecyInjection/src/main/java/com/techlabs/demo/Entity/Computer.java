package com.techlabs.demo.Entity;

public class Computer {
	
	private String name;
	private HardDisk harddisk;
	
	public Computer() {
		
	}
	
	public Computer(String name, HardDisk harddisk) {
		super();
		this.name = name;
		this.harddisk = harddisk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HardDisk getHarddisk() {
		return harddisk;
	}
	public void setHarddisk(HardDisk harddisk) {
		this.harddisk = harddisk;
	}
	
	
	


}
