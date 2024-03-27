
class Sample2
{
	Sample2 test()
	{
		System.out.println("I am class Sample  -  2");
		return new Sample2();		// It is possible to override if parent method return type and child method return type are different at class level
	}
}

class Sample3 extends Sample2
{
	Sample3 test()		// It is possible to override if parent method return type and child method return type are different at class level
	{
		System.out.println("I am class Sample  -  3");
		return new Sample3();		// It is possible to override if parent method return type and child method return type are different at class level
	}
}
class Example16
{
	public static void main(String args[])
	{
		Sample3 obj = new Sample3();
		obj.test();
	}
}