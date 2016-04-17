package com.fitt.web.fittws.test.monster;

/**
 * <p> Description	: Role.java </p>
 * <p> Copyright	: Copyright (c) 2016 by PCI-SUNTEK</p>
 * <p> Author 		: ZCCHUN </p>
 * <p> Create		: 2016年2月19日 下午2:37:46 </p> 
 * <p> version 		: 1.0 </p>
 */
public class Role {
	public IAttackStrategy weapon;
	
	public IAttackStrategy getWeapon() {
		return weapon;
	}

	public void setWeapon(IAttackStrategy weapon) {
		this.weapon = weapon;
	}

	public void attack(Monster monster) {
		this.weapon.attack(monster);
	}
}
