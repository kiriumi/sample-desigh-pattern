package behavior.visitor;

/**
 * Acceptインターフェース
 * @author Kengo
 *
 */
public interface IfAcceptable {

	public void accept(IfVisitable visitor);
}
