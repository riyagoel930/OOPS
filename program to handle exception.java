public class File{
	void m() {
		System.out.println("device error");
		}
	void n() {
		m();
		System.out.println("Hiet");
	}
	void p() {
		try {
			n();
		}catch(Exception e) {
			System.out.println("Handler");
		}
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
File f = new File();
f.p();
System.out.println("riya");
}
}
