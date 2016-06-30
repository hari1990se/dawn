
import java.util.Scanner;

class PowerOfTwo
{
	public static void main(String... strings) throws Exception
	{
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while(T-- > 0)
		{
			Scanner sc = new Scanner(System.in);
			int N;
			N = sc.nextInt();
			int[] Arr = new int[N];
			int flag = 0;
			for(int i = 0; i < N; i++)
			{
				Arr[i] = sc.nextInt();
				if(Integer.bitCount(Arr[i]) == 1)
				{
					flag = 1;
				}
			}
			if(flag == 1)
			{
				System.out.println("YES");
			}
			else
			{
				for(int i = 1; i < 1000000000; i *= 2)
				{
					int k = Integer.MAX_VALUE;
					int count = 0;
					for(int j : Arr)
					{
						if((i & j) != 0)
						{
							count++;
							k &= j;
						}
					}
					if(k == i && count != 0)
					{
						flag = 1;
						break;
					}
				}
				if(flag == 1)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}
		}
	}
}