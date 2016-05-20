import java.util.Scanner;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

class AryanSubSequenceAndGreatXOR
{
	public static void main(String... strings)
	{
		int N;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		List <Integer> list = new ArrayList <Integer>();
		while(N > 0)
		{
			list.add(scanner.nextInt());
			N--;
		}
		ListIterator <Integer> it = list.listIterator();
		int result = 0;
		while(it.hasNext())
		{
			result = result | it.next();
		}
		System.out.println(result);
	}
}