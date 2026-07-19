package com.designpattern.creational.builder.gaming;

import com.designpattern.creational.builder.build.Computer;
import com.designpattern.creational.builder.build.ComputerBuilder;

public class OfficeComputer implements ComputerBuilder {

    private final String HDD;
    private final String RAM;

    // Optional parameters
    private String graphicsCard;
    private String bluetooth;

    public OfficeComputer(String HDD, String RAM) {
        this.HDD = HDD;
        this.RAM = RAM;
    }

    @Override
    public ComputerBuilder enableGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    @Override
    public ComputerBuilder enableBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(HDD, RAM, graphicsCard, bluetooth);
    }
}
