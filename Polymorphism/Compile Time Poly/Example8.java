class Student
{
	Student(String student)
	{
		System.out.println("College student -- Sahil");
	}

	Student(String student , String College)
	{
		System.out.println("Student name is sahil and college is -- DBATU");
	}
}

class Example8
{
	// Constructor name should remain same but different no. of args

	
	
	public static void main(String[] args)
	{
		Student var = new Student("Sahil" , "DBATU");
	}
}