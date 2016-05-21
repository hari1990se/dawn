import java.util.Scanner;

class RoyAndProfilePicture
{
	public static void main(String... strings)
	{
		Scanner scanner = new Scanner(System.in);
		int L, N, W, H;
		L = scanner.nextInt();
		N = scanner.nextInt();
		while(N > 0) {
			W = scanner.nextInt();
			H = scanner.nextInt();
			if(W < L || H < L) {
				System.out.println("UPLOAD ANOTHER");
			} else if(W >= L && H >= L && W == H) {
				System.out.println("ACCEPTED");
			} else {
				System.out.println("CROP IT");
			}
			N--;
		}
	}
}