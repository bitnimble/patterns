import Examples.AdapterExample.AdapterExample;
import Examples.DecoratorExample.DecoratorExample;
import Examples.Example;
import Examples.FlyweightExample.FlyweightExample;
import Examples.SingletonExample.SingletonExample;

public class Main {

    public static void main(String[] args) {
		Example example = new FlyweightExample();
		System.out.println("Result: " + example.executeExample());
    }
}
