package com.fitt.web.fittws.test.monster;

/**
 * <p> Description	: WoodSword.java </p>
 * <p> Copyright	: Copyright (c) 2016 by PCI-SUNTEK</p>
 * <p> Author 		: ZCCHUN </p>
 * <p> Create		: 2016年2月19日 下午2:35:39 </p> 
 * <p> version 		: 1.0 </p>
 */
public class WoodSword implements IAttackStrategy {

	@Override
	public void attack(Monster monster) {
		monster.notify(50);
	}
}
