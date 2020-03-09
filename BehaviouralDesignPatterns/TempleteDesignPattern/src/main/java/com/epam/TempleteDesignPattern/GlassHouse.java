package com.epam.TempleteDesignPattern;

public class GlassHouse extends HousingTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls");
		
		
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with glass coating");		
	}

}
