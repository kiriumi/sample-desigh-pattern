package visitor;

public class VisitorClient {

	public static void main (String... args) {

		IfVisitable visitor1 = new Visitor1();
		IfVisitable visitor2 = new Visitor2();

		IfAcceptable acceptor1 = new Acceptor1();
		IfAcceptable acceptor2 = new Acceptor2();

		acceptor1.accept(visitor1);
		acceptor1.accept(visitor2);

		acceptor2.accept(visitor1);
		acceptor2.accept(visitor2);
	}
}