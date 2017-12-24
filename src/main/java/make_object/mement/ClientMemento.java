package make_object.mement;

public class ClientMemento {

	public static void main(String[] args) {

		Caretaker caretacer = new Caretaker();

		Originator originator = new Originator("A", "あ");
		caretacer.saveMement(originator.createMemento());

		originator.setMementParam("B");
		originator.setParam("い");

		caretacer.saveMement(originator.createMemento());

		originator.info(); // 復元前のOriginatorの状態

		originator.restore(caretacer.getMement(0));

		originator.info(); // 復元後のOriginatorの状態

	}
}
