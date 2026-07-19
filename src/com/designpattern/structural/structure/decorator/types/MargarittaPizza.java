package com.designpattern.structural.structure.decorator.types;

import com.designpattern.structural.structure.decorator.types.inter.Pizza;

public class MargarittaPizza implements Pizza {

	@Override
	public String getDescription() {
		return "margaritta pizza";
	}

	@Override
	public float getCost() {
		return 110f;
	}

}
