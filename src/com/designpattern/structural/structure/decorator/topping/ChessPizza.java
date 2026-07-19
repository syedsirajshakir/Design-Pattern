package com.designpattern.structural.structure.decorator.topping;

import com.designpattern.structural.structure.decorator.types.inter.Pizza;

public class ChessPizza extends Decorator {

	public ChessPizza(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescription() {
		return this.pizza.getDescription()+" Addon Chess Pizza";
	}

	@Override
	public float getCost() {
		return this.pizza.getCost()+30;
	}

}
