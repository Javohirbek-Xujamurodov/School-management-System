package version2;

public class Teacher {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private double salaryEarned;
    private School school;

    public Teacher(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void receiveSalary() {
        if (school != null && school.paySalary(salary)) {
            salaryEarned += salary;
        } else {
            System.out.println("Xatolik: Maktab balansida yetarli mablag‘ yo‘q!");
        }
    }
}
