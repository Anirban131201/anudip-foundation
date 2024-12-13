import java.util.*;

// Class representing a Teacher
class Teacher1 {
    
    private String name;
    private int age;

    // Constructor to initialize Teacher details
    public Teacher1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Override toString for a formatted teacher representation
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

// Class representing a Faculty containing Teachers
public class TeachersFaculty {
    
    private String department;
    private List<Teacher1> teachers;

    // Constructor to initialize department
    public TeachersFaculty(String department) {
        this.department = department;
        this.teachers = new ArrayList<>();
    }

    // Method to add a teacher to the faculty
    public void addTeacher(Teacher1 teacher) {
        teachers.add(teacher);
    }

    // Getter for the list of teachers
    public List<Teacher1> getTeachers() {
        return teachers;
    }

    // Override toString to display the department and teachers
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("The teachers in the '").append(department).append("' department are:\n");
        for (Teacher1 teacher : teachers) {
            sb.append(teacher).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
    	
        // Create Teacher instances
        Teacher1 teacher1 = new Teacher1("Rahul Mishra", 42);
        Teacher1 teacher2 = new Teacher1("Summanth Reddy", 32);
        Teacher1 teacher3 = new Teacher1("N. Ramana Reddy", 36);

        // Create Faculty instance
        TeachersFaculty faculty = new TeachersFaculty("MCA");

        // Add teachers to the faculty
        faculty.addTeacher(teacher1);
        faculty.addTeacher(teacher2);
        faculty.addTeacher(teacher3);

        // Print faculty details
        System.out.println(faculty);
    }
}
