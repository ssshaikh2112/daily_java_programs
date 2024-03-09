class A	
{
	static void m1()		// Static variables are also part of the inheritance
	{
		System.out.println("Method m1 -- 1");
	}
		
}
class B extends A
{
	static void m2()		// Static variables are also part of the inheritance
	{
		System.out.println("Method m2 -- 2");
	}		
}
class Example10
{
	public static void main(String args[])
	{
		A.m1();
		B.m1();
		B.m2();
	}
}