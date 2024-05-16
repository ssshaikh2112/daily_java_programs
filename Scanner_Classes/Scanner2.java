import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
class Scanner2
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File ff=new File("D:\\Programming\\cybersuccess\\ScannerClass\\Scanner2TextFile.txt");		// read the content from file
		Scanner scan= new Scanner(ff);
		while (scan.hasNext())
		{
			System.out.print(" "+scan.next());
		}
	}
}
// public java.io.File(java.lang.String);
//  public java.util.Scanner(java.io.File) throws java.io.FileNotFoundException