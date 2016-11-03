package Examples.FlyweightExample;

/**
 * Created by Declan on 003 3/11/16.
 */
public class SpriteInstance {
	Sprite spriteData;
	int x, y;

	public SpriteInstance(Sprite spriteData, int x, int y) {
		this.spriteData = spriteData;
		this.x = x;
		this.y = y;
	}
}
