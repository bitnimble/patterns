package Examples.SingletonExample;

import Examples.Example;

/**
 * Created by Declan on 003 3/11/16.
 */
public class SingletonExample implements Example {
	@Override
	public String executeExample() {
		Singleton singleton = Singleton.getInstance();
		int firstValue = singleton.getValue();

		Singleton anotherSingleton = Singleton.getInstance();
		int secondValue = anotherSingleton.getValue();

		return Boolean.toString(firstValue == secondValue);
	}
}
