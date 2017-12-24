package chain_of_process.proxy;

public class ClientSubject {

	public static void main(String[] args) {

		IfSubject subject = new Proxy();

		subject.methodA();

		subject.methodB();
	}

}
