package employees;
import enumerations.WorkingExperience;
import exceptions.InvalidWorkingHours;
import randomize.Randomize;


final public class HourlyBasedStaff extends Academic{
	
	private WorkingExperience experience;
	private int workedhours=0;
	static final private int maxMonthlyWorkingHours=40;
	private int monthysalary;
	
	public HourlyBasedStaff(int id) {
		super(id);
		experience=Randomize.WorkingExperience();
		
	}

	public void setWorkedHours(int workedhours)throws InvalidWorkingHours {
		if(workedhours>maxMonthlyWorkingHours) 
			throw new InvalidWorkingHours("Sorry. Maximum Working Hours Allowed are: "+maxMonthlyWorkingHours); 
		this.workedhours=workedhours;
	}

	@Override
	public int CalculateMonthlySalary() {
		int onTopSalary=0;
		if (experience==WorkingExperience.uptoFiveYears) onTopSalary=workedhours*10;
		if (experience==WorkingExperience.FiveToTenYears) onTopSalary=workedhours*20;
		if (experience==WorkingExperience.morethanTenYears) onTopSalary=workedhours*30;
		
		monthysalary=baseMonthlySalary+onTopSalary;
		
		
		return monthysalary;
	}
	
	public void printInfo() {
		System.out.println(" ");
		System.out.println("EmployeeID:"+super.getEmployeeID()+ " is hourly based. ");
		System.out.println("Working Experience:"+experience);
		System.out.println("Working Hours:"+workedhours);
		System.out.println("Hourly based employee salary:"+monthysalary);
		
	}
}
