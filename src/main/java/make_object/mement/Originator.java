package make_object.mement;

public class Originator {

	private String mementoParam;
	private String param;

	public Originator(String mementoParam, String param) {
		this.mementoParam = mementoParam;
		this.param = param;
	}

	public String getMementParam() {
		return mementoParam;
	}

	public void setMementParam(String mementoParam) {
		this.mementoParam = mementoParam;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public Memento createMemento() {
		return new Memento(mementoParam);
	}

	public void restore(Memento memento) {
		this.mementoParam = memento.getMementParam();
	}

	public void info() {
		System.out.print("MementoParam = " + mementoParam + ", ");
		System.out.println("Param = " + param);
	}
}
