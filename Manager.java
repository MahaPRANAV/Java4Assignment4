package PayrollSystem;

public class Manager extends Employee {

	int ManagerPerks ;
	
	public int GetSalHike(int EmpNo,Double Salary,char appraisalrating,String Role,int ManagerPerks)
	  { 
	     	if 	(appraisalrating == 'A' && Role == "MANAGER") 
	     	{
	     		Salhike = 10000 + ManagerPerks;
	     	}
	     	else if (appraisalrating == 'A' && Role == "SENIORMANAGER")
	     	{
	     		Salhike = 20000 + ManagerPerks;
	     	}
	     	else 
	     	{
	     		Salhike = 0;
	     	}
	     	return Salhike;
	    }
	
	public Manager (int EmpNo,String EmployeeName,char appraisalrating,String Role,int ManagerPerks) 
	{
		super(EmpNo,EmployeeName,appraisalrating,Role);
		this.ManagerPerks = ManagerPerks;
	}

	
	
}
