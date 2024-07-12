package com.example.structure.decorator;

public class BasePizza implements Pizza {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Base Pizza";
	}

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return 100f;
	}

}
