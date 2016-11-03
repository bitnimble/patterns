package Examples.SingletonExample;

import java.util.Random;

/**
 * Created by Declan on 003 3/11/16.
 */
public class Singleton {
	private static Singleton instance;

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	private int value;
	private Singleton() {
		value = new Random().nextInt();
	}

	public int getValue() {
		return value;
	}
}
