package com.company;

public class Main {

	public static void main(String[] args) {
		Boss boss = new Boss();
		Weapon weapon = new Weapon("hammerName", "hammerType");
		boss.setDamage(110);
		boss.setHealth(300);
		boss.setWeapon(weapon);
		System.out.println("Boss health = " + boss.getHealth() + " Boss damage = " + boss.getDamage() + " " + boss.getWeapon().getHammerName() + " " + boss.getWeapon().getHammerType());

		Skelet s1 = new Skelet();
		s1.setArrow(6);
		System.out.println(s1.printInfo());

		Skelet s2 = new Skelet();
		s2.setArrow(10);
		System.out.println(s2.printInfo());

	}

}
