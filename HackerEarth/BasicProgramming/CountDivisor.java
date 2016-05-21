import java.util.Scanner;

class CountDivisor
{
	public static void main(String... strings)
	{
		int l, r, k;
		Scanner scanner = new Scanner(System.in);
		l = scanner.nextInt();
		r = scanner.nextInt();
		k = scanner.nextInt();
		int count = 0;
		for(int i = l; i <= r; i++) {
			if(i % k == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}