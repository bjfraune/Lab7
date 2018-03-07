import java.util.ArrayList;


public class DirectoryEditor {
	public static void main (String [] args){
		DirectoryProxy dp = new DirectoryProxy();
		ArrayList <Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Adam","Smith",32444,"EE"));
		emp.add(new Employee("Sarah","John",63254,"CF"));
		emp.add(new Employee("Laura","John",63254,"CF"));
		emp.add(new Employee("Henry","Jonathan",63254,"CF"));
		
		dp.add(emp);
	}
}
