package etc.replace_switch;

public class Employee {

	private final String name;
	private final EmployeeType type;

	public Employee(String name, EmployeeType type) {
		this.name = name;
		this.type = type;
	}

	public void print() {
		System.out.println(name + ": " + type.payAmount());
	}
}
