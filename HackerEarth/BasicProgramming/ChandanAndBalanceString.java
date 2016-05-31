import java.util.Scanner;
import java.util.Arrays;

class ChandanAndBalanceString
{
	boolean checkBalanceString(String str)
	{
		int[] Arr = new int[26];
		Arrays.fill(Arr, 0);
		for(char x : str.toCharArray()) {
			Arr[x - 97] = Arr[x - 97] + 1;
		}
		for(int i : Arr) {
			if((i & 1) != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String... strings)
	{

		Scanner scanner = new Scanner(System.in);
		int T;
		T = scanner.nextInt();
		int count  = 0;
		while(T > 0) {
			Scanner sc = new Scanner(System.in);
			count = 0;
			String string = scanner.next();
			for (int from = 0; from < string.length(); from++) {
        		for (int to = from + 1; to <= string.length(); to++) {
            		if((new ChandanAndBalanceString()).checkBalanceString(string.substring(from, to))) {
            			count++;
            		}
            	}
            }
            System.out.println(count);
            T--;
        }
    }
}