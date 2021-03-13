package com.company;

public class Weapon {
    private String hammerType;
    private String hammerName;


    public Weapon(String hammerName, String hammerType) {
        this.hammerName = hammerName;
        this.hammerType = hammerType;
    }

    public String getHammerType() {
        return hammerType;
    }

    public String getHammerName() {
        return hammerName;
    }
}



