interface Demo		// interface keyword is used for interfaces class
{
	void method();	// All methods in interfaces are incomplete , complete methods can not be allow
}
class Example15 implements Demo	// while we compile it , it creates the both .class files
{
	public void method()	// public because give the acccessibility more to child than parent
	{
		System.out.println("These is the Interfaces Method.....");
	}
	public static void main(String[] args)
	{
		Example15 obj = new Example15();
		obj.method();
	}
}