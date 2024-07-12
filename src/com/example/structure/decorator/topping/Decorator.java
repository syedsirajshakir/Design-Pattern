package com.example.structure.decorator.topping;

import com.example.structure.decorator.Pizza;

public abstract class Decorator implements Pizza {

	Pizza pizza;
	
	public Decorator(Pizza pizza) {
		this.pizza=pizza;
	}

}
