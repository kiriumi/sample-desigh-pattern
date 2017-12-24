package structure.builder;

public class Builder2 implements IfBuilder {

	private Product product;

	public Builder2() {

		this.product = new Product();
	}

	@Override
	public void buildPartA() {

		product.setPartA("A2");
	}

	@Override
	public void buildPartB() {

		product.setPartB("B2");
	}

	@Override
	public Product getResult() {

		return product;
	}

}
