package Examples.DecoratorExample.Buffs;

/**
 * Created by Declan on 003 3/11/16.
 */
public class NoBuff implements Buff {
	DamageType type = DamageType.NORMAL;

	public DamageType getDamageType() {
		return type;
	}
}
