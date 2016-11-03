package Examples.AdapterExample;

import Examples.Example;

/**
 * Created by Declan on 003 3/11/16.
 */
public class AdapterExample implements Example {
	@Override
	public String executeExample() {
		BetterInterface better = new BetterClass();
		return Integer.toString(SomeMethodThatTakesBetterInterface(better));
	}

	private int SomeMethodThatTakesBetterInterface(BetterInterface better) {
		return better.betterMethod();
	}
}
