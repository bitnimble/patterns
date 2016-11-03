package Examples.AdapterExample;

/**
 * Created by Declan on 003 3/11/16.
 */
public class BetterClass implements BetterInterface {
	CrappyClass inner = new CrappyClass();

	@Override
	public int betterMethod() {
		return inner.crappyMethod();
	}
}
