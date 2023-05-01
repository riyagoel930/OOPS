package Employee;
class Employee 
{
	 float Salary=40000;
 }
 class Programmer extends Employee{
	 float  Bonous=100000;
	 float total=Salary+Bonous;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p = new Programmer();
		System.out.println("Programmer salary: "+p.Salary);
		System.out.println("Bonus salary     : "+p.Bonous);
		System.out.println("Total salary     : "+p.total);
	}

}
