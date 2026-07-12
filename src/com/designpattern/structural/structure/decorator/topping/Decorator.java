package com.designpattern.structural.structure.decorator.topping;

import com.designpattern.structural.structure.decorator.Pizza;

public abstract class Decorator implements Pizza {

	Pizza pizza;
	
	public Decorator(Pizza pizza) {
		this.pizza=pizza;
	}

}
