import java.util.Scanner;
/*import java.util.Character;*/

class ToggleString
{
	public static void main(String... strings)
	{
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		StringBuilder stringBuilder = new StringBuilder(str.length());
		for(char x : str.toCharArray()) {
			if(Character.isUpperCase(x)) {
				x = Character.toLowerCase(x);
			} else {
				x = Character.toUpperCase(x);
			}
			stringBuilder.append(x);
		}
		System.out.println(stringBuilder);
	}
}