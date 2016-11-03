package Examples.VisitorExample;

/**
 * Created by Declan on 003 3/11/16.
 */
public class Data {
	public String internalData = "I like dogs";

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
