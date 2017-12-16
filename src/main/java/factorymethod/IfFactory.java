package factorymethod;

/**
 * 生成するオブジェクトごとにFactoryを用意する
 *
 * @author Kengo
 *
 */
public interface IfFactory {

	public IfProduct create();
}
