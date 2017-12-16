package composite;

public interface IfComponent {

	default public void add(IfComponent component) {

	}

	public void execute();
}
