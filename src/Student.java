import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String studentId;
    private String email;

    public Student(String name, int age, String studentId, String email) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Bob", 20, "S001", "bob@example.com");
        Student s2 = new Student("Bob", 20, "S002", "bob@example.com");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.hashCode() == s2.hashCode()); // true
    }
}

