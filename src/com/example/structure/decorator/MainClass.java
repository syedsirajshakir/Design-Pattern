package com.example.structure.decorator;


import com.example.structure.decorator.topping.ChessPizza;
import com.example.structure.decorator.topping.PannerPizza;

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
