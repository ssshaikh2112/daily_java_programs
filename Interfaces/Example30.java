interface It1
{
	int number1=10;
}

interface It2
{
	int number1=20;
}
/*
	static members are not part of inheritance with respect to INTERFACE.

	In both variables of an interface having same name then is confusing 
	hence while accessing both static variables in 2 different interface 
	will prefer to access them with the help of interface
*/
class Example30 implements It1 , It2
{
	public static void main(String[] args)
	{
		System.out.println(It1.number1);
		System.out.println(It2.number1);
	}
}