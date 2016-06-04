import java.util.Scanner;

class Employee
{
	private String name;
	private int salary;
	private String department;

	public void setName(String name) 
	{
		this.name = name;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public void setDepartment(String department)
	{
		this.department = department;
	}

	public String getName()
	{
		return this.name;
	}

	public int getSalary()
	{
		return this.salary;
	}

	public String getDepartment()
	{
		return this.department;
	}
}

class Manager extends Employee
{
	@Override
	public int getSalary()
	{
		int salary = super.getSalary();
		return salary + 100;
	}
}

class Clerk extends Employee
{
	@Override
	public int getSalary()
	{
		int salary = super.getSalary();
		return salary - 100;
	}
}

class P1
{
	public static void main(String... strings)
	{
		Employee employee = new Manager();
		employee.setDepartment("Computer Science");
		employee.setName("Amit");
		employee.setSalary(500);
		System.out.println("Manager's salary = " +employee.getSalary());
		employee = new Clerk();
		employee.setSalary(500);
		System.out.println("Clerk's salary = " +employee.getSalary());
	}
}