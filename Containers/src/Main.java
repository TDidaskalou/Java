package main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Ship> ships = new ArrayList<Ship>();
		
		
		
		Ship ship1 = new Ship("Hercules",450);
		Ship ship2 = new Ship("Copacabana",900);
		Ship ship3 = new Ship("Hermes",900);
		Ship ship4 = new Ship("Zeus",900);
	
		
		
		
		ships.add(ship1);
		ships.add(ship2);
		ships.add(ship3);
		ships.add(ship4);
	
		
		
		
		
		ChargeCalculator c = new ChargeCalculator(ships);
		
	}

}
