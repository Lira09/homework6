package com.company;

public class Boss extends GameEntity{
    private Weapon weapon;

    public Boss(){
    }
    public Boss(int damage, int health,Weapon weapon) {
        super(damage, health);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return "Health:"+ getHealth()+"  Damage:" + getDamage() + "  Weapon name:" + weapon.getWeaponName()+ "  Weapon type:" + weapon.getWeaponType();
    }
}