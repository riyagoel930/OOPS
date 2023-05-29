package OOPss;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFromFile {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
		File f = new File("D:FileOperation.txt");
		Scanner dataReader=new Scanner( (Readable) f);
		while(dataReader.hasNextLine()) {
			boolean fileData = dataReader.hasNextLine();
			System.out.println(fileData);
		}
		dataReader.close();
		}catch(Exception e) {
			System.out.println("Unexpected errror occured!");
			e.printStackTrace();
		}
}
}
