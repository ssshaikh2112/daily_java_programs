abstract class Demo
{
	Demo()
	{
		// super() by default present
		System.out.println("These is the Constructor of Parent class.....");
	}
}
class Example11 extends Demo
{
	Example11()
	{
		// super() by default present
		System.out.println("These is the Constructor of child class.....");
	}
	public static void main(String[] args)
	{
		new Example11();
	}
}