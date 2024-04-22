import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class FileInOutStream
{
	public static void main(String[] args) throws FileNotFoundException , IOException	// error while compiling so throws exception
	{
		// source.txt --> Program --> Destination.txt

		FileInputStream fis = new FileInputStream("D:\\Programming\\cybersuccess\\IOPackages\\Source1.txt");
		FileOutputStream fos = new FileOutputStream("D:\\Programming\\cybersuccess\\IOPackages\\Destination.txt");
		int info;													// read() return int so use the int info variable.
		//System.out.println((char)info);								print only one letter (first) through out the file
		while ((info=fis.read())!=-1)								// for multiple letters are in the file so use loop.
		{
			System.out.print((char)info);
			fos.write(info);
		}
		fis.close();												// close objects because unneccessory memory is created.
		fos.close();												// close objects because unneccessory memory is created.
	}
}

//	Search below classes / methods / exceptions from oracle offitial website

// public FileInputStream(String name) throws FileNotFoundException
// public int read() throws IOException
// public FileOutputStream(String name) throws FileNotFoundException
//public void write(int b) throws IOException

/*
	(1)byteOrientedStream Channel

To perform read and write operation with the help of byteOrientedStream channel.
It is possible ny creating objrcts.

Hence java supports 2 classes.

	i)	Input Stream
	ii)	Output Stream

The child classes have file Input as well output stream.

Both classes are regular or normal classes hence we are able to create an object.

For read operation we need to create object of fileInputStream and for write operation we need to create an object of fileOutputStream.

NOTE : It is mandatory to create source file. But not to mandatory create destination file. If we don't create destination file java will automatically create it.

*/