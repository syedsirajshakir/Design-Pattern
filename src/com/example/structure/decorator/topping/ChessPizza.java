package com.example.structure.decorator.topping;

import com.example.structure.decorator.Pizza;

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
		// TODO Auto-generated method stub
		return this.pizza.getCost()+30;
	}

}
