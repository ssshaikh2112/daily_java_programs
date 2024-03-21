abstract class One 
{
	abstract void method();
}
class Two
{
	void method()
	{
		System.out.println("These is these the normal class....");	
	}
}
class Example3
{
	public static void main()
	{
		One ref1=new One();		// can not create the object of abstract class
		Two ref2= new Two();
		Example3 ref3 = new Example3();
	}
}