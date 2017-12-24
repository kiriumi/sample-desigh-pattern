package make_object.factorymethod;

/**
 * 生成するオブジェクトごとにFactoryを用意する
 *
 * @author Kengo
 *
 */
public interface IfFproductFactory {

	public static IfProduct create() {
		return new ProductNull();
	}
}
