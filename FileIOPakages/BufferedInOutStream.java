import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

class BufferedInOutStream
{
	public static void main(String[] args) throws FileNotFoundException , IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Programming\\cybersuccess\\IOPackages\\BufferedInOutSource1.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);		// With the help of BufferStream we hit the memory at least once base on 
																	//	no. of bytes , char,letters. Due to which it will lead the context of memory within the buffer area
		FileOutputStream fos = new FileOutputStream("D:\\Programming\\cybersuccess\\IOPackages\\BufferedInOutDestination1.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);	// With the help of BufferStream we hit the memory at least once base on 
																	//	no. of bytes , char,letters. Due to which it will lead the context of memory within the buffer area

		int info;
		while ((info = fis.read())!=-1)
		{
			System.out.print((char)info);
			fos.write(info);
		}

	}
}

//BufferedInputStream(InputStream in)
//BufferedOutputStream(OutputStream out)
// BufferedInputStream(InputStream in)
//import java.io.FileInputStream;
//import java.io.FileOutputStream;

/*
	Each time from RAM memory we need to hit memory (HardDisk) to extract context or info due to which it will be time consuming

	As well as degrades the performance.

	To overcome these we need to make use of BufferedStream

	NOTE : BufferStream dependes on I/O stream or reader and writer stream
*/