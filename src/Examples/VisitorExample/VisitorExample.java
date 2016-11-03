package Examples.VisitorExample;

import Examples.Example;

/**
 * Created by Declan on 003 3/11/16.
 */
public class VisitorExample implements Example {
	@Override
	public String executeExample() {
		StringBuilder builder = new StringBuilder();
		Data data = new Data();
		Visitor visitor = new Visitor();

		builder.append("Pre visit: " + data.internalData + "\n");
		data.accept(visitor);

		builder.append("Post visit: " + data.internalData);
		return builder.toString();
	}
}
