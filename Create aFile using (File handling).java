package OOPss;
import java.io.File;
import java.io.IOException;
public class CreateFile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			///create an object file
			File f = new File("D:FileOperation.txt");
			if(f.createNewFile()) {
				System.out.println("File"+f.getName()+"is created successfully");
			}
			else {
				System.out.println("File is already exit in directory.");
			}
		}catch(IOException e) {
			System.out.println("An unexpected error is occured.");
			e.printStackTrace();
		}
	}
}
