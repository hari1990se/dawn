import java.util.Scanner;

class LifeUniverse
{
	public static void main(String... strings)
	{
		int N;
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		if(N == 42)
		{
			flag = false;
		}
		else
		{
			System.out.println(N);
		}
		while(flag)
		{
			N = scanner.nextInt();
			if(N == 42)
			{
				flag = false;
			}
			else
			{
				System.out.println(N);
			}
		}
	}
}