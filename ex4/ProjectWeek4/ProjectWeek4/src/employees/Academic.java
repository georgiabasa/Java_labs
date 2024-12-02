package employees;

public class Academic {
	
	static final int baseMonthlySalary=500;
	private int id;
	Academic(int id){
		this.id=id;
	}
	
	public int CalculateMonthlySalary() {
		return baseMonthlySalary;
	}

	public int getEmployeeID() {return id;}
}
