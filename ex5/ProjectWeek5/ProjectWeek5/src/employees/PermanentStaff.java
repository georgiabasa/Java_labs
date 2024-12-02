package employees;

import enumerations.Bathmida;

import randomize.Randomize;

final public class PermanentStaff extends Academic{
	private Bathmida rank;
	private int monthysalary;
	
	public PermanentStaff(int id){
		super(id);
		
		rank=Randomize.Bathmida();
		CalculateMonthlySalary();
	}
	
	@Override
	public int CalculateMonthlySalary() {
		int onTopSalary=0;
		if (rank==Bathmida.Lecturer) onTopSalary=1000;
		if (rank==Bathmida.Assistant) onTopSalary=1200;
		if (rank==Bathmida.Associate) onTopSalary=1400;
		if (rank==Bathmida.Professor) onTopSalary=1500;
		monthysalary=baseMonthlySalary+onTopSalary;
		return monthysalary;
	}

	public Bathmida getBathmida() {return rank;}
	
	public void printInfo() {
		System.out.println("");
		System.out.println("EmployeeID:"+super.getEmployeeID()+ " is permanent. ");
		System.out.println("Academic rank:"+rank);
		System.out.println("Hourly based employee salary:"+monthysalary);
		
	}
	
	public int getSalary() {return monthysalary;} 
}
