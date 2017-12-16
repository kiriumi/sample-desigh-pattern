package visitor;

/**
 * Visitorのインターフェース
 * @author Kengo
 *
 */
public interface IfVisitable {

	public void visit(Acceptor1 acceptor1);

	public void visit(Acceptor2 acceptor2);
}
