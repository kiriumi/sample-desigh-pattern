package mement;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

	List<Memento> mements = new ArrayList<Memento>();

	public void saveMement(Memento memento) {
		mements.add(memento);
	}

	public Memento getMement(int index) {
		return mements.get(index);
	}
}
