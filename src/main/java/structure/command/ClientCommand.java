package structure.command;

public class ClientCommand {

	public static void main(String[] args) {

		Invoker invoker = new Invoker();

		IfReceiver receiver1 = new Receiver1();
		IfReceiver receiver2 = new Receiver2();

		IfCommand commandA = new CommandA();
		IfCommand commandB1 = new CommandB();
		IfCommand commandB2 = new CommandB();

		commandA.setReceiver(receiver1);
		commandB1.setReceiver(receiver1);
		commandB2.setReceiver(receiver2);

		invoker.add(commandA);
		invoker.add(commandB1);
		invoker.add(commandB2);

		invoker.remove(commandB1);

		invoker.executeAll();

	}

}
