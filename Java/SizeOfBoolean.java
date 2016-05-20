class PrimitiveSize
{
	public static final int BOOLEAN = 1;
	public static final int BYTE = 1;
	public static final int SHORT = 2;
	public static final int CHAR = 2;
	public static final int INT = 4;
	public static final int FLOAT = 4;
	public static final int LONG = 8;
	public static final int DOUBLE = 8;
}

class SizeOfBoolean
{
	public static void main(String... strings)
	{
		boolean bol = true;
		System.out.println("Size of boolean = " +PrimitiveSize.BOOLEAN);
	}
}