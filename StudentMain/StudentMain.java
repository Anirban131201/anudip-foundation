public class StudentMain {

	public static void main(String[] args) {
		
		//using the Javabean
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		//inputing details of student1
		student1.setId(101);
		student1.setName("Rahul");
		student1.setSubjects(new String[] { "Mathematics", "Physics", "Chemistry" });
		
		//inputing details of student2
		student2.setId(102);
		student2.setName("Vikrant");
		student2.setSubjects(new String[] { "Accountancy", "Business studies", "Economics" });
		
		//inputing details of student3
		student3.setId(103);
		student3.setName("Akhil");
		student3.setSubjects(new String[] { "History", "Philosophy", "Political science" });
		
		//printing all the student details
		System.out.println("Student 1 details:");
		System.out.println(student1);
		System.out.println("\n\nStudent 2 details:");
		System.out.println(student2);
		System.out.println("\n\nStudent 3 details:");
		System.out.println(student3);
	}
}
