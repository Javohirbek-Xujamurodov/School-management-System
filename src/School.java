
import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    public School() {
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void updateMoneyEarned(int amount) {
        totalMoneyEarned += amount;
    }

    public void updateMoneySpent(int amount) {
        totalMoneySpent += amount;
    }
}
