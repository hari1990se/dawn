import java.util.Scanner;

class Factorial
{
	public static void main(String... strings)
	{
		int N;
		int result = 1;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		for(int i = 2; i <= N; i++) {
			result = i * result;
		}
		System.out.println(result);
	}
}