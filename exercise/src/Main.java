import entities.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		System.out.println("Exercise!");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employees> employees = new ArrayList<>();
		
		System.out.println("how a may employees wil be rented?");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i ++) {
			System.out.println("Employee #" + i + ":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			int salary = sc.nextInt();
			Employees e = new Employees();
			
			e.Employees(name, salary);
			
			employees.add(e);

			System.out.println("Employee register: " + i);
			System.out.println("Id: " + e.getId());
			System.out.println("Name: " + e.getName());
			System.out.println("Salary: " + e.getSalary());
		}
		
		System.out.println("Would you like to change the salary of a worker?");
		

			System.out.println("Provide worker id");
			int idEmployee = sc.nextInt();
			System.out.println("What is the increase rate?");
			int tax = sc.nextInt();
			
			Employees result = employees
															 .stream()
															 .filter(x -> x.getId() == idEmployee)
															 .findFirst().orElse(null);
			
			System.out.println(result);
		
		sc.close();
	}
}