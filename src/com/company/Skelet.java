package com.company;

public class Skelet extends Boss{
    private int arrow;

    public int getArrow() {
        return arrow;
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }

    @Override
    public String printInfo() {
        return "arrow ="+arrow;
    }
}
