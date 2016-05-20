package BasicProgramming;

import java.util.Scanner;

/**
 * Created by hshanker on 10-05-2016.
 */
public class GameOfCoins
{
    public static void main(String... strings)
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T > 0)
        {
            /**This question is spurge grundy theorem. Therefore Alice wins always
             * That is why for every test case I am printing Alice */
            int N;
            N = scanner.nextInt();
            System.out.println("Alice");
            T--;
        }
    }
}
