class Sample1
{

}
class Sample2
{
	Sample1 test()
	{
		System.out.println("I am class Sample  -  2");
		return new Sample1();		// It is possible to override if parent method return type and child method return type are same at class level
	}
}

class Sample3 extends Sample2
{
	Sample1 test()		// It is possible to override if parent method return type and child method return type are same at class level
	{
		System.out.println("I am class Sample  -  3");
		return new Sample1();		// It is possible to override if parent method return type and child method return type are same at class level
	}
}
class Example15
{
	public static void main(String args[])
	{
		Sample3 obj = new Sample3();
		obj.test();
	}
}