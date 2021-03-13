package com.company;

public class Weapon {
    private String weaponType;
    private String weaponName;


    public Weapon(String weaponName, String weaponType) {
        this.weaponName = weaponName;
        this.weaponType = weaponType;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public String getWeaponName() {
        return weaponName;
    }
}



