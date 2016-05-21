import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class FicdProduct
{
	public static void main(String... strings)
	{
		int N;
		List <Integer> Arr = new ArrayList<Integer> ();
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		for(int i = 0; i < N; i++) {
			Arr.add(scanner.nextInt());
		}
	/*	for(int i:Arr) {
			System.out.println(i);
		}
	*/
		long result = 1;
		for(int i:Arr) {
			result = (result * i) % 1000000007;
		}
		System.out.println(result);
	}
}