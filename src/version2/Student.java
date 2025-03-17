package version2;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int grade;
    private double feesPaid;
    private double feesTotal;
    private School school;

    public Student(int id, String firstName, String lastName, int grade, double feesTotal) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.feesTotal = feesTotal;
        this.feesPaid = 0;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void pay(double fees) {
        if (feesPaid + fees <= feesTotal) {
            feesPaid += fees;
            if (school != null) {
                school.receiveFees(fees);
            }
        } else {
            System.out.println("Xatolik: To‘lov miqdori noto‘g‘ri!");
        }
    }

    public double getRemainingFees() {
        return feesTotal - feesPaid;
    }

    public String getFirstName() {
        return firstName;
    }
}
