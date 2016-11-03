package Examples.DecoratorExample;

import Examples.DecoratorExample.Buffs.FireBuff;
import Examples.DecoratorExample.Buffs.IceBuff;
import Examples.DecoratorExample.Weapons.Bow;
import Examples.DecoratorExample.Weapons.Sword;
import Examples.DecoratorExample.Weapons.Weapon;
import Examples.Example;

/**
 * Created by Declan on 003 3/11/16.
 */
public class DecoratorExample implements Example {
	@Override
	public String executeExample() {
		StringBuilder builder = new StringBuilder();
		Weapon weapon;

		//Bow
		weapon = new Bow();
		builder.append(weapon.getDamageString() + "\n");
		weapon.setBuff(new FireBuff());
		builder.append(weapon.getDamageString() + "\n");
		weapon.setBuff(new IceBuff());
		builder.append(weapon.getDamageString() + "\n");

		//Sword
		weapon = new Sword();
		builder.append(weapon.getDamageString() + "\n");
		weapon.setBuff(new FireBuff());
		builder.append(weapon.getDamageString() + "\n");
		weapon.setBuff(new IceBuff());
		builder.append(weapon.getDamageString() + "\n");

		return builder.toString();
	}
}
