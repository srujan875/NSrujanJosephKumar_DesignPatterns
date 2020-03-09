package com.epam.TempleteDesignPattern;

public class WoodenHouse extends HousingTemplate{

	@Override
	public void buildWalls() {
		System.out.println("Building Wooden Walls");
		
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with Wood coating");
		
	}

}
