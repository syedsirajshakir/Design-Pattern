package com.designpattern.creational.builder.build;

public class Computer {

    private final String HDD;
    private final String RAM;
    private final String graphicsCard;
    private final String bluetooth;

    public Computer(String HDD, String RAM, String graphicsCard, String bluetooth) {
        this.HDD = HDD;
        this.RAM = RAM;
        this.graphicsCard = graphicsCard;
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", bluetooth='" + bluetooth + '\'' +
                '}';
    }
}
