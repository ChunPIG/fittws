package com.fitt.web.fittws.test.monster;

/**
 * <p> Description	: Test.java </p>
 * <p> Copyright	: Copyright (c) 2016 by PCI-SUNTEK</p>
 * <p> Author 		: ZCCHUN </p>
 * <p> Create		: 2016年2月19日 下午2:39:00 </p> 
 * <p> version 		: 1.0 </p>
 */
public class Test {
	public static void main(String[] args) {
		
		Monster monster1 = new Monster("小怪兽", 100);
		Monster monster2 = new Monster("中怪兽", 200);
		Monster monster3 = new Monster("大怪兽", 400);
		Monster monster4 = new Monster("终极怪兽", 500);
		
		Role role = new Role();
		
		role.setWeapon(new WoodSword());
		role.attack(monster1);
		
		role.setWeapon(new IronSword());
		role.attack(monster2);
		role.attack(monster3);
		
		role.setWeapon(new MagicSword());
		role.attack(monster1);
		role.attack(monster2);
		role.attack(monster3);
		role.attack(monster3);
		role.attack(monster3);
		role.attack(monster3);
		role.attack(monster4);
		role.attack(monster4);
		role.attack(monster4);
		role.attack(monster4);
		role.attack(monster4);
		
	}
}
