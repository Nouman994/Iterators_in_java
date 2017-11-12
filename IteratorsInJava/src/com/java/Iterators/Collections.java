package com.java.Iterators;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Collections {
	
	// pojo class for Employee
	
	public static class Employee{
		int id;
		String name;
		double salary;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return String.format("Employee name is %s and the salary is %s.", name, salary);
		}
		
	}

	public static void main(String[] args) {
		
/*		Employee emp1 = new Collections().new Employee();*/

		Employee emp1 = new Employee();
		emp1.setId(101);
		emp1.setName("Usman");
		emp1.setSalary(300.25d);
		Employee emp2 = new Employee();
		emp2.setId(103);
		emp2.setName("Kamran");
		emp2.setSalary(125.5d);
		Employee emp3 = new Employee();
		emp3.setId(102);
		emp3.setName("Mamoon");
		emp3.setSalary(234.40d);

		ArrayList<Employee> list2 = new ArrayList<>();
		list2.add(emp1);
		list2.add(emp2);
		list2.add(emp3);
		
		for (Employee employee : list2) {
			System.out.println(employee);
		}
		

/*		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Islamabad");
		list1.add("Lahore");
		list1.add("Karachi");

		System.out.println(list1);

		// loop through a list using for each loop
		for (String string : list1) {
			System.out.println(string);
		}

		// loop through a list using ListIterator
		ListIterator<String> listIterator = list1.listIterator();
		while (listIterator.hasNext()) {
			String value = listIterator.next();
			System.out.println(value);
		}*/
		


	}

}
