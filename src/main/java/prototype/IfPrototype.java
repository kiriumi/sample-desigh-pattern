package prototype;

public interface IfPrototype extends Cloneable {

	public IfPrototype createClone() throws CloneNotSupportedException;

	public void execute1();

	public void execute2(int i);

}
