package cap04_Strings_Arrays;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * @font https://www.codejava.net/java-core/collections/sorting-arrays-examples-with-comparable-and-comparator
 */
public class ArraySort {

	public static void main(String[] args) throws ParseException {

		String beforeStr = "Before sorting: ";
		String afterStr = "After sorting: ";

		List<Integer> itens = Arrays.asList(11, 10, 16, 5, 85, 21, 50, 2);
		itens.sort(null);
		if (!itens.isEmpty()) {
			int i = itens.size();
			int j = 1;
			for (Integer item : itens) {
				System.out.print(item);
				if (j < i) {
					System.out.print(" - ");
				}
				j++;
			}
			System.out.print(" Fim!\n");
		}
		itens.forEach(item -> System.out.print((!itens.isEmpty()) ? 
				((itens.get(itens.size() - 1) == item.intValue()) ? 
						item + " Fim!\n" : item + " - ") : null));

		int[] numbers = { 4, 9, 1, 3, 2, 8, 7, 0, 6, 5 };
		System.out.println("\n" + beforeStr + Arrays.toString(numbers));
		
		Arrays.sort(numbers, 0, 5);
		System.out.println("\nSorted a half: " + Arrays.toString(numbers));
		System.out.println("\nSort by order Numerical\n" + beforeStr
				+ Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println(afterStr + Arrays.toString(numbers));

		String[] fruits = { "Orange", "Grape", "Apple", "Lemon", "Banana" };
		System.out.println("\nSort by order Alphabetical\n" + beforeStr
				+ Arrays.toString(fruits));
		Arrays.sort(fruits);
		System.out.println(afterStr + Arrays.toString(fruits));

		System.out.println("\nAlphabetical reverse order");
		Arrays.sort(fruits, Collections.reverseOrder());
		System.out.println(afterStr + Arrays.toString(fruits));

		Employee[] employees = new Employee[4];
		employees[0] = new Employee("Tom", 45, 80000);
		employees[1] = new Employee("Sam", 56, 75000);
		employees[2] = new Employee("Alex", 30, 120000);
		employees[3] = new Employee("Peter", 25, 60000);

		Employee[] newEmployees = new Employee[4];
		int k = 0;
		for (Employee employee : employees) {
			newEmployees[k] = employee;
			k++;
		}

		System.out.println("\n" + beforeStr + Arrays.toString(employees));
		Arrays.sort(employees);
		System.out.println(afterStr + Arrays.toString(employees));

		System.out.println("\nSort by Salary:\n" + beforeStr
				+ Arrays.toString(newEmployees));
		Arrays.sort(newEmployees, new EmployeeSalaryComparator());
		System.out.println(afterStr + Arrays.toString(newEmployees));

		System.out.println(
				"\nSort by Age:\n" + beforeStr + Arrays.toString(newEmployees));
		Arrays.sort(newEmployees, new EmployeeAgeComparator());
		System.out.println(afterStr + Arrays.toString(newEmployees));

		System.out.println("\nSort by Name:\n" + beforeStr
				+ Arrays.toString(newEmployees));
		Arrays.sort(newEmployees, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		});
		System.out.println(afterStr + Arrays.toString(newEmployees));

		Date[] dates = new Date[3];
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			dates[0] = dateFormat.parse("2022-09-30");
			dates[1] = dateFormat.parse("2022-07-06");
			dates[2] = dateFormat.parse("2022-11-28");
		} catch (ParseException ex) {
			System.err.print(ex);
		}

		System.out.println(
				"\nSort by Date\n" + beforeStr + Arrays.toString(dates));
		Arrays.sort(dates);
		System.out.println(afterStr + Arrays.toString(dates));
	}
}
