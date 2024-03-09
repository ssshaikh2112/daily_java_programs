class A	
{
	static int rollno= 101;		// Static variables are also part of the inheritance
}
class B extends A
{
	static char name='S';		// Static variables are also part of the inheritance
}
class Example11
{
	public static void main(String args[])
	{
		System.out.println(A.rollno);
		System.out.println(B.name);
		System.out.println(B.rollno);
	}
}