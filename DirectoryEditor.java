
public class DirectoryEditor {
	

	public static void main (String [] args){
		DirectoryProxy dp = new DirectoryProxy();
		MainDirectory company = new MainDirectory();
		createPeoples(dp);
		company.transfer( dp.printJsonFormatArrList());
		company.print();
		company.clear();
		company.print();
		System.out.println();
		createPeoples(dp);
		company.transfer( dp.printJsonFormatArrList());
		company.print();
	}
	
	public static void createPeoples(DirectoryProxy dp){
		dp.add(new Employee("Adam","mast",32444,"EE"));
		dp.add(new Employee("Sarah","alast",63254,"CF"));
		dp.add(new Employee("Laura","blast",63254,"SF"));
		dp.add(new Employee("Henry","clast",63254,"NF"));
	}
}
