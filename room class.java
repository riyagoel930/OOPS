package leraning;



public class Room {

	
	
		int roomno;
		String roomtype,roomarea,acmachine;
	
		 void setData()
{
			
		
		 roomno = 101;
			roomtype = "Single";
		 roomarea = "Ground flooor";
			 acmachine = "yes";
		}
	
		 void displayData() 
		{
			
			
			// TODO Auto-generated method stub
			System.out.println("Room number: " +roomno);
			System.out.println("Roomtype: " + roomtype);
			System.out.println("Room Area : " + roomarea);
			System.out.println("AC Machine: " + acmachine);
		}

		
			public static void main(String[] args) {
		Room r = new Room();
		r.setData();
		r.displayData();
			}
}
