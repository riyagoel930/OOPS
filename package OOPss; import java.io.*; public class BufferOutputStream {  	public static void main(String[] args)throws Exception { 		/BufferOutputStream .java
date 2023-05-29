package OOPss;
import java.io.*;
public class BufferOutputStream {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Welcome to Java World!";
		byte b[] = s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("successfull");
	}

}
