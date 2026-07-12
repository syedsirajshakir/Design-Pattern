package com.designpattern.structural.structure.decorator.topping;

import com.designpattern.structural.structure.decorator.Pizza;

public class PannerPizza extends Decorator {

	public PannerPizza(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescription() {
		return this.pizza.getDescription()+" Addon, Panner";
	}

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return this.pizza.getCost()+20;
	}

}
