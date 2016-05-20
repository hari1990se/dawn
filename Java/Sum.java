import java.util.Scanner;

class Sum
{
	public static void main(String... strings)
	{
		int x, y;
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		y = scanner.nextInt();
		x = x + y;
		System.out.println("Sum = " +x);
	}
}