import java.util.Scanner;

class PalindromeString
{
	public static void main(String... strings)
	{
		Scanner scaner = new Scanner(System.in);
		StringBuilder bstr = new StringBuilder(scaner.next());
		StringBuilder rbstr = bstr.reverse();
		int len = bstr.length();
		int N = len - 1;
		boolean flag = true;
		for(int i = 0; i < len; i++, N--) {
			if(bstr.charAt(i) != rbstr.charAt(N)) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}