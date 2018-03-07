public class Employee {
	private String _fname;
	private String _lname;
	private String _phone;
	private String _department;

	public Employee(String firstName, String lastName, String department, String phoneNumber) {
		_fname = firstName;
		_lname = lastName;
		_phone = phoneNumber;
		_department = department;
	}

	public void setFirstName(String name) {
		_fname = name;
	}

	public void setLastName(String name) {
		_lname = name;
	}

	public String getFirstName() {
		return _fname;
	}
	
	public String getLastName() {
		return _lname;
	}

	public void setPhoneNumber(String number) {
		_phone = number;
	}

	public void setDepartment(String department) {
		_department = department;
	}

	@Override
	public String toString() {
		return _lname + ", " + _fname + " " + _phone + " " + _department;
	}

}