package com.fitt.web.fittws.test.monster;

import java.util.Random;

/**
 * <p> Description	: WoodSword.java </p>
 * <p> Copyright	: Copyright (c) 2016 by PCI-SUNTEK</p>
 * <p> Author 		: ZCCHUN </p>
 * <p> Create		: 2016年2月19日 下午2:35:39 </p> 
 * <p> version 		: 1.0 </p>
 */
public class MagicSword implements IAttackStrategy {

	@Override
	public void attack(Monster monster) {
		Random rand = new Random();
		int loss = rand.nextDouble() < 0.5 ? 200 : 400;
		if (400 == loss) {
			System.out.println("出现暴击！！！！");
		}
		monster.notify(loss);
	}
}
