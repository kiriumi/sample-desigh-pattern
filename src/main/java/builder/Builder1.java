package builder;

public class Builder1 implements IfBuilder {

	private Product product;

	public Builder1() {

		this.product = new Product();
	}

	@Override
	public void buildPartA() {

		product.setPartA("A1");
	}

	@Override
	public void buildPartB() {

		product.setPartB("B1");
	}

	@Override
	public Product getResult() {

		return product;
	}

}
