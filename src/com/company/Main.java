package com.company;

public class Main {

	public static void main(String[] args) {
		Boss boss = new Boss();
		Weapon weapon = new Weapon("Mjolnir", "Thunder");
		boss.setDamage(110);
		boss.setHealth(300);
		boss.setWeapon(weapon);
		System.out.println("Boss \n" + boss.printInfo());

		Weapon weapon1 = new Weapon("Crossbow", "Fire");
		Skelet s1 = new Skelet();
		s1.setHealth(100);
		s1.setDamage(10);
		s1.setArrow(6);
		s1.setWeapon(weapon1);
		System.out.println("Skeleton \n" + s1.printInfo());

		Weapon weapon2 = new Weapon("Bow", "Ice");
		Skelet s2 = new Skelet();
		s2.setHealth(150);
		s2.setDamage(15);
		s2.setArrow(10);
		s2.setWeapon(weapon2);
		System.out.println("Skeleton2 \n" + s2.printInfo());

	}

}
