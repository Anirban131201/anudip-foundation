public class Employee {
	
	//private properties
	private String name;
	private int age;
	private String department;
	
	//no-argument constructor
	public Employee() {
		
	}
	
	//parameterised constructor
	public Employee(String name, int age, String department) {
		this.name=name;
		this.age=age;
		this.department=department;
	}
	
	//getter and setter for name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	//getter and setter for age
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	//getter and setter for department
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department=department;
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee("Ankit",22,"Marketting");
		System.out.println("Name: "+employee.getName()+"\nAge: "+employee.getAge()+"\nDepartment: "+employee.getDepartment());
	}
}
