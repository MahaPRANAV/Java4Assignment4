package PayrollSystem;

public class MainClass {

	

	public static void main(String[] args) {

		Employee emp = new Employee(1,"Maha",'A',"SSE") ;
		
		 
		 System.out.println("Employee "+ emp.EmployeeName + "Salary Hike is" + emp.getSalhike() );
		 
		Manager mgr = new Manager(2,"Pranadh",'A',"MANAGER",10000);
		
		 System.out.println("Employee "+ mgr.EmployeeName + "Salary Hike is" + mgr.getSalhike() );

	}

}
