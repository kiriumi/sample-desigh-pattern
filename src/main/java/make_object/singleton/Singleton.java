package make_object.singleton;

public class Singleton {

	private Singleton instance;

	private Singleton() {

	}

	public Singleton getInstance() {

		this.instance = (instance == null)
				? new Singleton()
				: instance;

		return instance;
	}

}
