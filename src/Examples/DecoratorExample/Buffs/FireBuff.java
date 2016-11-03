package Examples.DecoratorExample.Buffs;

/**
 * Created by Declan on 003 3/11/16.
 */
public class FireBuff implements Buff {
	DamageType type = DamageType.FIRE;

	public DamageType getDamageType() {
		return type;
	}
}
