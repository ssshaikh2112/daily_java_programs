class ParentClass
{
	int number1=10;
}
class ChildClass extends ParentClass
{
	float number2=110.5f;
}
class Example19
{
	/*
		Child Object is behaving as parent is called Upcasting.

		Whenever child behave as parent it will loss characteristicks of
		child and accquire characteristicks of parents.

		Child behave as parent then also behave as child then process is called DownCasting

	*/
	public static void main(String[] args)
	{
		// Upcasting
		ParentClass obj1=new ChildClass();
		System.out.println(obj1.number1);
		//System.out.println(obj1.number2);		Error Not possible
		System.out.println("-----");

		// DownCasting
		ChildClass obj2 = (ChildClass)obj1;
		System.out.println(obj2.number1);
		System.out.println(obj2.number2);
	}
}