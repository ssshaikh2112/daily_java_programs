import java.util.Scanner;

class SalaryIncrement
{
	public static void main(String[] args) 
	{

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Salary : ");
		double salary=scan.nextDouble();

		System.out.println("Enter Your Score : ");
		int score =scan.nextInt();

		if(score>0 && score<100)
		{
			
			if(score>=90)
			{
				System.out.println("Previous Salary : "+salary);
				salary=salary+((salary/100)*3);
				System.out.println("Incremented salary by 3% is : "+salary+"rs.");

			}
			else
			{
				System.out.println("Previous Salary : "+salary);
				salary=salary+((salary/100)*1);
				System.out.println("Incremented salary by 1% is : "+salary+"rs.");
			}

		}
		else
		{
			System.out.println("Do the Calculations...");
		}
		
	}
}