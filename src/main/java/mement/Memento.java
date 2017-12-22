package mement;

public class Memento {

	private String mementoParam;

	public Memento(String mementoParam) {
		this.mementoParam = mementoParam;
	}

	public String getMementParam() {
		return mementoParam;
	}

	public void setMementParam(String mementoParam) {
		this.mementoParam = mementoParam;
	}

}
