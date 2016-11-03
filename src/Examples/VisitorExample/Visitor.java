package Examples.VisitorExample;

/**
 * Created by Declan on 003 3/11/16.
 */
public class Visitor {
	public void visit(Data data) {
		data.internalData = "I like cats";
	}
}
