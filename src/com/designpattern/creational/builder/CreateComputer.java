package com.designpattern.creational.builder;

import com.designpattern.creational.builder.build.Computer;
import com.designpattern.creational.builder.gaming.GamingComputer;
import com.designpattern.creational.builder.gaming.OfficeComputer;

public class CreateComputer {


    public static void main(String[] args) {

    Computer gamingComputer = new GamingComputer("2 TB","16gb").enableGraphicsCard("NVIDIA GeForce RTX 3080").enableBluetooth("Bluetooth 5.0").build();

    Computer officeComputer = new OfficeComputer("1 TB","8gb").enableGraphicsCard("Integrated Graphics").enableBluetooth("Bluetooth 4.0").build();

    System.out.println(gamingComputer);
    System.out.println(officeComputer);

    }
}
