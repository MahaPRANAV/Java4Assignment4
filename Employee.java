package PayrollSystem;

public class Employee {

	String EmployeeName;
	int EmpNo;
	char appraisalrating;
	String ReportingManager;
	String Role;
	int Salhike;
	
	public int GetSalHike(int EmpNo,Double Salary,char appraisalrating,String Role)
  { 
     	if 	(appraisalrating == 'A' && Role == "SSE") 
     	{
     		Salhike = 10000;
     	}
     	else if (appraisalrating == 'A' && Role == "LEAD")
     	{
     		Salhike = 10000;
     	}
     	else 
     	{
     		Salhike = 0;
     	}
     	return Salhike;
    }
	
	public Employee (int EmpNo,String EmployeeName,char appraisalrating,String Role)
	{
		this.EmpNo = EmpNo;
		this.EmployeeName = EmployeeName;
		this.appraisalrating = appraisalrating;
		this.Role = Role ;
		}

	public String getEmployeeName() {
		return EmployeeName;
	}

	
	public int getEmpNo() {
		return EmpNo;
	}


	

	public char getAppraisalrating() {
		return appraisalrating;
	}
    
	

	public String getReportingManager() {
		return ReportingManager;
	}

	public void setReportingManager(String reportingManager) {
		ReportingManager = reportingManager;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public int getSalhike() {
		return Salhike;
	}

		
		 
	
}


