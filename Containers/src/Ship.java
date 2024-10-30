package main;

import java.util.*;

public class Ship {

	private String name;
	private int capacity;
	ArrayList<Container> containers = new ArrayList<Container>();
	
	
	public Ship(String name, int capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}
	
	
	
	public void addContainer(Container aContainer) {
		if(containers.size() < capacity) {
		containers.add(aContainer);
		}
		else {
			System.out.println("Sorry ship full");
		}
	}
	
	
	public double getTotalCharge() {
		double totalCharge = 0;
		
		for(Container container :containers) {
			totalCharge = totalCharge +container.getCharge();
		}
		
		return totalCharge ;
	}



	public String getName() {
		return name;
	}
	
	
	 public String toString(){
		  return name;
		 }  
	
}



