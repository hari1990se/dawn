import java.util.Scanner;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

class ChandanAndSubString
{
	boolean checKBalance(String str)
	{
		boolean flag = true;
		List <Integer> list = new ArrayList <Integer> (26);
		int i = 0;
		while(i < 26)
		{
			list.add(0);
			i++;
		}
		int len = str.length();
		i = 0;
		while(len > 0)
		{
			char ch = str.charAt(i);
			int index = (int) ch - 96;
			list.add(index, list.get(index) + 1);
		}
		ListIterator <Integer> it = list.listIterator();
		while(it.hasNext())
		{
			int n = it.next();
			if((n != 0) && ((n & 1) == 1))
			{
				flag = false;
			}
		}
		return flag;
	}
	public static void main(String... strings) throws IOException
	{
		int T;
		Scanner scanner = new Scanner(System.in);
		T = scanner.nextInt();
		ChandanAndSubString chandanAndSubString = new ChandanAndSubString();
		while(T > 0)
		{
			int count = 0;
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			for(int i = 0; i < str.length(); i++)
			{
				for(int j = 0; j < str.length() - i; j++)
				{
					String substr = str.substring(i, str.length() - j);
					int len = substr.length();
					if(len % 2 == 0)
					{
						if(chandanAndSubString.checKBalance(substr))
						{
							count++;
						}
					}
				}
			}
			System.out.println(count);
			T--;
		}
	}
}