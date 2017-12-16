package replace_switch;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ClientCompany {

	public static void main(String... args) {

		List<Employee> employees = Arrays.asList(
				new Employee("engineer", new Engineer()),
				new Employee("manager", new Manager()));

		Stream<Employee> stream = employees.stream();
		stream.forEach(employee -> employee.print());
	}
}
