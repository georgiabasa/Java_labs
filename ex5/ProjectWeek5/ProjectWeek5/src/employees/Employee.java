package employees;
import java.util.HashMap;
import java.util.LinkedList;

abstract public class Employee {
	static private LinkedList<Employee> linkedlist=new LinkedList<Employee>();
	static private HashMap <Integer,Employee> hashmaplist = new HashMap<Integer,Employee>();
	
	abstract public void printInfo();
	abstract public int getEmployeeID();
	
	public static void addEmployeeNode(Employee x) {
		linkedlist.add(x);
		hashmaplist.put(x.getEmployeeID(),x);
	}
	
	public static Employee search_with_HashMap(int id) {
		long startTime,estimatedTime;
		Employee tmp=null;
		startTime = System.currentTimeMillis();
		tmp=hashmaplist.get(id);
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Time elapsed with HashMap :"+ estimatedTime+" miliseconds");	
		return tmp;
	}
	
	public static Employee search_with_linkedList(int id) {
		long startTime,estimatedTime;
		Employee tmp=null;
		int i=0;
		startTime = System.currentTimeMillis();
		while (i < linkedlist.size()) {
			if(linkedlist.get(i).getEmployeeID()==id) {
				tmp=linkedlist.get(i);
				break;
			}
		    i++;
		}
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Time elapsed with linkedlist :"+ estimatedTime+" miliseconds");
		 
		return tmp;
	}
	
	
	
}
