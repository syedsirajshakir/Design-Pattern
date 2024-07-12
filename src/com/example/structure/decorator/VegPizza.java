package com.example.structure.decorator;

public class VegPizza implements Pizza {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Veg Pizza";
	}

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return 120f;
	}

}
