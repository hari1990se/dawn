import java.util.Scanner;

class AldrinJustice
{
	public static void main(String... strings)
	{
		int b1, b2, m1, m2;
		int T;
		Scanner scanner = new Scanner(System.in);
		T = scanner.nextInt();
		while(T > 0)
		{
			b1 = scanner.nextInt();
			b2 = scanner.nextInt();
			m1 = scanner.nextInt();
			m2 = scanner.nextInt();
			int maxb = Math.max(b1, b2);
			int maxm = Math.max(m1, m2);
			int minb = Math.min(b1, b2);
			int minm = Math.min(m1, m2);
			int l = Math.min(maxb, maxm);
			int r = Math.max(minb, minm);
			if(l < r)
			{
				System.out.println("Line");
			}
			else if(l > r)
			{
				System.out.println("Nothing");
			}
			else if(l == r)
			{
				System.out.println("Point");
			}
			T--;			
		}
	}
}