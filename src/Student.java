public class Student {
    int id;
    String firstName;
    String lastName;
    int grade;
    int feesPaid = 0;
    int feesTotal = 30000;

    public Student(int id, String firstName, String lastName, int grade, int feesPaid, int feesTotal) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.feesPaid = feesPaid;
        this.feesTotal = feesTotal;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void payFees(int amount) {
        feesPaid += amount;
    }
}
