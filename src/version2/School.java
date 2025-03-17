package version2;

public class School {
    private Teacher[] teachers;
    private Student[] students;
    private double balance;
    private int teacherCount;
    private int studentCount;

    public School(int maxTeachers, int maxStudents) {
        this.teachers = new Teacher[maxTeachers];
        this.students = new Student[maxStudents];
        this.balance = 0;
        this.teacherCount = 0;
        this.studentCount = 0;
    }

    public void addTeacher(Teacher teacher) {
        if (teacherCount < teachers.length) {
            teachers[teacherCount++] = teacher;
            teacher.setSchool(this);
        } else {
            System.out.println("Xatolik: O‘qituvchilar soni limiti oshib ketdi!");
        }
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
            student.setSchool(this);
        } else {
            System.out.println("Xatolik: O‘quvchilar soni limiti oshib ketdi!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void receiveFees(double amount) {
        balance += amount;
    }

    public boolean paySalary(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Xatolik: mablag‘ yetarli emas!");
            return false;
        }
    }
}
