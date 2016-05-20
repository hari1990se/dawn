package BasicProgramming;

import java.util.Scanner;
/**
 * Created by hshanker on 10-05-2016.
 */
public class ASCIIValue
{
    public static void main(String... strings)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println((int) (scanner.next().charAt(0))) ;
    }
}
