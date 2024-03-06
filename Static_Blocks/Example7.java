class AnotherClass1
{
	static int number;
	static
	{
		System.out.println("These is static block : "+ number);
		number = 10;
	}

	static void method()
	{
		System.out.println("Value of number is : "+number);
	}
}

class AnotherClass2
{
	static int number;
	static
	{
		System.out.println("These is static block : "+ number);
		number = 10;
	}

	static void method()
	{
		System.out.println("Value of number is : "+number);
	}
}

class Example7
{

	public static void main(String[] args)
	{
		System.out.println("These is Main block...");
		System.out.println("Value of number in AnotherClass is : "+AnotherClass1.number);
		System.out.println("Value of number in AnotherClass is : "+AnotherClass2.number);
	}
}

/*
	Only when JVM is clear as well as aware to call other class members only then an
	explicity call will be give to class loader to load the static members in memory
*/