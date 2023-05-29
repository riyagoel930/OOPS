package OOPss;
import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileWriter fwrite = new FileWriter("D:FileOperation.txt");
		fwrite.write("A named locatioon used to restore related information is referenced");
		fwrite.close();
		System.out.println("fIle succesfully ");
		}catch(IOException e) {
			System.out.println("Unexpected error occured");
			e.printStackTrace();
		}
	}

}
