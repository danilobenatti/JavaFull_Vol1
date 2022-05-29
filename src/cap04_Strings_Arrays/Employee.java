package cap04_Strings_Arrays;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

	private String name;
	private int age;
	private int salary;

	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("(%s, %d, %d)", name, age, salary);
	}

	@Override
	public int compareTo(Employee employee) {
		return this.salary - employee.salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(name, other.name)
				&& salary == other.salary;
	}

}
