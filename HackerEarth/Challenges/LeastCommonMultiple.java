import java.util.Scanner;
import java.math.BigInteger;

class LeastCommonMultiple
{
	public BigInteger gcd(BigInteger x, BigInteger y)
	{
		BigInteger r = new BigInteger(y.mod(x).toString());
		while(r.toString() != "0")
		{
			y = x;
			x = r;
			r = y.mod(x);
		}
		return x;
	}
	public static void main(String... strings)
	{
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		BigInteger N = new BigInteger(string);
		BigInteger i = new BigInteger("1");
		LeastCommonMultiple leastCommonMultiple = new LeastCommonMultiple();
		BigInteger resultGCD = new BigInteger("1");
		while(i.longValue() <= N.longValue())
		{
			/*System.out.println("GCD = " +resultGCD);*/
			BigInteger multiplication = resultGCD.multiply(i);
			resultGCD = leastCommonMultiple.gcd(resultGCD, i);
			resultGCD = multiplication.divide(resultGCD);
			i = i.add(new BigInteger("1"));
			/*System.out.println("i = " +i);*/
		}
		BigInteger result = resultGCD;
		i = new BigInteger(N.subtract(new BigInteger("1")).toString());
		/*LeastCommonMultiple leastCommonMultiple = new LeastCommonMultiple();*/
		resultGCD = new BigInteger(N.toString());
		while(i.longValue() >= 1)
		{
			/*System.out.println("GCD = " +resultGCD);*/
			BigInteger multiplication = resultGCD.multiply(i);
			resultGCD = leastCommonMultiple.gcd(i, resultGCD);
			resultGCD = multiplication.divide(resultGCD);
			/*System.out.println("i = " +i);*/
			if(resultGCD.equals(result))
			{
				break;
			}
			i = i.subtract(new BigInteger("1"));
		}
		System.out.println(i.toString());
	}
}