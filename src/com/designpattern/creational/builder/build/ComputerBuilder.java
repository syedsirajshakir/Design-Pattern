package com.designpattern.creational.builder.build;

public interface ComputerBuilder {

    ComputerBuilder enableGraphicsCard(String graphicsCard);
    ComputerBuilder enableBluetooth(String bluetooth);

    Computer build();

}
