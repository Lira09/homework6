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

    public void setHealth() {
    }
    public String printInfo(){
        return "bossHelth "+ this.getHealth()+" bossDamage " + this.getDamage() + "weapon " + weapon.getHammerName() + weapon.getHammerType();
    }
}