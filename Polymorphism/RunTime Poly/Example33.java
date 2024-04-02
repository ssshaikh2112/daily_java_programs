class P
{
	int number1 = 10;
}
class C extends P
{
	int number2 = 20;
}

/*
	Variables are not part of polimorphic behavior or neither part of Polymorphism.
	But Variables are part of Inheritance
*/
class Example33
{
	public static void main(String[] args)
	{
		P obj=new C();
		System.out.println(obj.number1);
	}
}