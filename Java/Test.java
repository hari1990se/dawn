import java.util.ArrayList;
import java.util.List;
class Test
{
	public static void main(String... strings)
	{
		List <Integer> list = new ArrayList <Integer> (5);
		list.add(4, 0);
		System.out.println(list.get(4));
	}
}