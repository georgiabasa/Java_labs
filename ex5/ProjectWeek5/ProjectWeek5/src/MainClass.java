import employees.Employee;
import employees.HourlyBasedStaff;
import employees.PermanentStaff;
import enumerations.StaffType;
import randomize.Randomize;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("HELLO PROJECT WEEK 5");
		int nOf=100000;
		createRandomizedEmployees(nOf);	
		
		int searchemployeeID=nOf/2;
		System.out.println("\n\nSearch with Linked List for Employee with id:"+searchemployeeID);
		Employee x=Employee.search_with_linkedList(searchemployeeID);
		x.printInfo();
		
		System.out.println("\nSearch with Hash Map with id:"+searchemployeeID);
		x=Employee.search_with_HashMap(searchemployeeID);
		x.printInfo();
	}
	public static void createRandomizedEmployees(int k) {
		System.out.println("Creating "+ k +" Randomized Employees");
		for(int i=1;i<=k;i++) {
			StaffType staff=Randomize.Staff();
			if (staff==StaffType.Permanent) {
				PermanentStaff pstaff=new PermanentStaff(i);
				Employee.addEmployeeNode(pstaff);//UP-CASTING
			}
			    
     		if (staff==StaffType.HourlyBased) { 
     			HourlyBasedStaff hstaff=new HourlyBasedStaff(i);
     			Employee.addEmployeeNode(hstaff);//UP-CASTING
     		}
		}
		System.out.println("Finished Randomized Employees");
		
	}
}
