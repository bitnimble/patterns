package Examples.DecoratorExample.Buffs;

/**
 * Created by Declan on 003 3/11/16.
 */
public class IceBuff implements Buff {
	DamageType type = DamageType.ICE;

	public DamageType getDamageType() {
		return type;
	}
}
