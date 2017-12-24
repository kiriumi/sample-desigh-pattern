package structure.builder;

public class Director {

	IfBuilder builder;

	public Director(IfBuilder builder) {

		this.builder = builder;
	}

	public Product construct() {

		builder.buildPartA();
		builder.buildPartB();

		Product product = builder.getResult();

		return product;
	}
}
