import java.util.HashSet;
import java.util.Objects;

class Student {
    String regNo;
    String name;

    Student(String regNo, String name) {
        this.regNo = regNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Student))
            return false;

        Student other = (Student) obj;
        return regNo.equals(other.regNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNo);
    }
}

public class StudentHashSet {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        students.add(new Student("101", "Arun"));
        students.add(new Student("102", "Bala"));
        students.add(new Student("101", "Arun Kumar"));

        System.out.println("Unique students: " + students.size());
    }
}
