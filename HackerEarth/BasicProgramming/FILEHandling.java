import java.io.FileInputStream;
import java.io.File;
import java.util.Scanner;

class FILEHandling
{
	public static void main(String... strings) throws Exception
	{
		//For UNIX based system example of file path "/home/sample.txt".
		File file = new File("C:/Users/hshanker/Desktop/test.txt");
        Scanner in = new Scanner(file);
        int words = 0;
        int lines = 0;
        int chars = 0;
        /*while(in.hasNextByte())
        {
            in.nextByte();
            chars++;
        } */
        while(in.hasNextLine())
        {
            in.nextLine();
            lines++;
        }
        in = new Scanner(file);
        while(in.hasNext())
        {
            String word = in.next();
            chars += word.length();
            /*in.next();*/
            words++;
        }
        in = new Scanner(file);
        /*for(String word:)*/
        System.out.println(lines);
        System.out.println(words);
        System.out.println(chars);
    }
}