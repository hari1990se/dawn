import java.util.Scanner;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Test
{
	String name();
	String desc();
}

class Employee
{
	private int salary;
	private String name;

	public void setName(String name)
	{
		this.name = name;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public String getName()
	{
		return this.name;
	}

	@Test(name = "test", desc = "Annotation test")
	public int getSalary()
	{
		System.out.println("If bonus is applicable");
		Scanner scanner = new Scanner(System.in);
		int bonus = scanner.nextInt();
		return this.salary + bonus;
	}
}

class P2
{
	public static void main(String... strings)
	{
		Employee employee = new Employee();
		employee.setName("Amit");
		employee.setSalary(1200);
		System.out.println(employee.getName() + " got " +employee.getSalary() +" salary");
	}
}

