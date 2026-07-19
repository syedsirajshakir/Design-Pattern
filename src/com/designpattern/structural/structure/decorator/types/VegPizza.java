package com.designpattern.structural.structure.decorator.types;

import com.designpattern.structural.structure.decorator.types.inter.Pizza;

public class VegPizza implements Pizza {

	@Override
	public String getDescription() {
		return "Veg Pizza";
	}

	@Override
	public float getCost() {
		return 120f;
	}

}
