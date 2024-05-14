class Example4
{
	public static void main(String[] args)
	{
		Integer aa=(100);	// in latest java version these is way to declare the Integer Wrapper class

		//Integer aa=new Integer(100);		in java 1.8 is perfect

		System.out.println(aa);
		System.out.println(aa.toString());	//The toString() from wrapper class is responsible to print the VALUE of wrapper object.
	}
}
/*
	The toString() is overridden in all Wrapper classes.
	The toString() from wrapper class is responsible to print the value of wrapper object.
	toString() is called from wrapper object class.
*/