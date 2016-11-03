package Examples.FlyweightExample;

import Examples.Example;

/**
 * Created by Declan on 003 3/11/16.
 */
public class FlyweightExample implements Example {

	@Override
	public String executeExample() {
		SpriteInstance[] instances = new SpriteInstance[1000000];
		Sprite sprite = new Sprite();
		//1,000,000 * 1024 * 1024 bytes = ~1TB if we didn't use flyweight
		//But since we share the data buffer, we only have 1,000,000 * SpriteInstance (two ints) and 1 * sprite (1024 * 1024 bytes)
		for (int i = 0; i < 1000000; i++) {
			instances[i] = new SpriteInstance(sprite, i, 0);
		}

		return "aw yiss";
	}
}
