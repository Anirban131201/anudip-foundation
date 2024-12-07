// Define the Person interface
interface Person1 {
    void speak();
}

// Implement the Student class
class Student1 implements Person1 {
    public void speak() {
        System.out.println("I am a student, and I love to learn new things!");
    }
}

// Implement the Teacher class
class Teacher implements Person1 {
    public void speak() {
        System.out.println("I am a teacher, and I enjoy teaching and guiding students!");
    }
}

public class StudentAndTeacher {
    public static void main(String[] args) {
        // Create an object of the Student class
        Person1 student = new Student1();
        student.speak(); // Call the speak method of the Student class

        // Create an object of the Teacher class
        Person1 teacher = new Teacher();
        teacher.speak(); // Call the speak method of the Teacher class
    }
}

