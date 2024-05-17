import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Scanner3
{
	public static void main(String[] args) throws FileNotFoundException
	{
		FileInputStream ff=new FileInputStream("D:\\Programming\\cybersuccess\\ScannerClass\\Scanner2TextFile.txt");
		Scanner scan= new Scanner(ff);
		while (scan.hasNext())
		{
			System.out.print(" "+scan.next());
		}
	}
}
// public java.io.File(java.lang.String);
//  public java.util.Scanner(java.io.File) throws java.io.FileNotFoundException