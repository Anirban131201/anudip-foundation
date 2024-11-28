public class Student {

    // Private properties
    private String name;
    private int age;
    private String department;

    // No-argument constructor
    public Student() {
        // Default constructor
    }

    // Parameterized constructor
    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating an object of Student using the parameterized constructor
        Student stu = new Student("Anirban", 22, "MCA");

        // Displaying student details
        System.out.println("Student Details:");
        System.out.println("Name: " + stu.getName());
        System.out.println("Age: " + stu.getAge());
        System.out.println("Department: " + stu.getDepartment());
    }
}
