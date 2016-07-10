import java.util.Scanner;

class LetsReview
{
	public static void main(String... strings)
	{
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while(T-- > 0)
		{
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			StringBuilder odd = new StringBuilder();
			StringBuilder even = new StringBuilder();
			for(int i = 0; i < str.length(); i++)
			{
				even.append(str.charAt(i));
				if(i < str.length())
				{
					odd.append(str.charAt(++i));
				}
			}
			System.out.println(even.toString()+ " " +odd.toString());
		}
	}
}