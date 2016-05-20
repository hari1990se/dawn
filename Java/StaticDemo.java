class StaticDemo
{
	private String name;
	private static String staticName = "Static String";
	StaticDemo(String str)
	{
		this.name = str;
	}
	void testObjectMethods()
	{
		System.out.println(name);
		System.out.println(staticName);
		/*In same class both are same */
		System.out.println(StaticDemo.staticName);
	}
	static void testStaticMethod()
	{
		/*Static can not be call from non static context */
		//System.out.println(name);
		System.out.println(staticName);
		/*In same class both are same */
		System.out.println(StaticDemo.staticName);
	}
	public static void main(String... strings)
	{
		StaticDemo.testStaticMethod();
		StaticDemo staticdemo = new StaticDemo("Hello");
		staticdemo.testObjectMethods();
	}
}