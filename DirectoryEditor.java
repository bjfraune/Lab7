
public class DirectoryEditor {

	public static void main (String [] args){
	
		DirectoryProxy dp = new DirectoryProxy();
		dp.add(new Employee("Adam","Smith",32444,"EE"));
		dp.add(new Employee("Sarah","John",63254,"CF"));
		dp.add(new Employee("Laura","John",63254,"SF"));
		dp.add(new Employee("Henry","Jonathan",63254,"NF"));
	}
}
