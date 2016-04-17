package com.fitt.web.fittws.test.monster;

/**
 * <p> Description	: Monster.java </p>
 * <p> Copyright	: Copyright (c) 2016 by PCI-SUNTEK</p>
 * <p> Author 		: ZCCHUN </p>
 * <p> Create		: 2016年2月19日 下午2:32:33 </p> 
 * <p> version 		: 1.0 </p>
 */
public class Monster {
	private String name;
	private int hp;
	
	public Monster() {
		super();
	}

	public Monster(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void notify(int hp) {
		if (hp <= 0) {
			System.out.println("怪兽[" + name + "]已死！");
			return;
		} else {
			this.hp -= hp;
			
			if (this.hp <= 0) {
				System.out.println("怪兽[" + name + "]已被打死!");
			} else {
				System.out.println("怪兽[" + name + "]减少 " + hp + " 能量!");
			}
		}
	}
}
