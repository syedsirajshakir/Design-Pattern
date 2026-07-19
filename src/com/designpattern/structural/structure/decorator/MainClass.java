package com.designpattern.structural.structure.decorator;


import com.designpattern.structural.structure.decorator.topping.ChessPizza;
import com.designpattern.structural.structure.decorator.topping.PannerPizza;
import com.designpattern.structural.structure.decorator.types.BasePizza;
import com.designpattern.structural.structure.decorator.types.MargarittaPizza;
import com.designpattern.structural.structure.decorator.types.VegPizza;
import com.designpattern.structural.structure.decorator.types.inter.Pizza;

public class MainClass {
	
	public static void main(String args[]) {
		Pizza pizza=new BasePizza();
		Pizza vegPizza=new VegPizza();
		Pizza margaritta=new MargarittaPizza();
		
		PannerPizza pannerPizza = new PannerPizza(pizza);
		ChessPizza chessPizza = new ChessPizza(margaritta);
		
		System.out.println(pannerPizza.getDescription()+".."+pannerPizza.getCost());
		System.out.println(chessPizza.getDescription()+"..."+chessPizza.getCost());
	}

}
