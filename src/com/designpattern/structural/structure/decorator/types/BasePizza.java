package com.designpattern.structural.structure.decorator.types;

import com.designpattern.structural.structure.decorator.types.inter.Pizza;

public class BasePizza implements Pizza {

	@Override
	public String getDescription() {
     	return "Base Pizza";
	}

	@Override
	public float getCost() {
		return 100f;
	}

}
