package Examples.DecoratorExample.Weapons;

import Examples.DecoratorExample.Buffs.Buff;
import Examples.DecoratorExample.Buffs.NoBuff;

/**
 * Created by Declan on 003 3/11/16.
 */
public abstract class Weapon {
	RangeType rangeType;
	Buff buff = new NoBuff();

	public void setBuff(Buff buff) {
		this.buff = buff;
	}

	public String getDamageString() {
		return this.rangeType.toString() + ", " + this.buff.getDamageType().toString();
	}
}
