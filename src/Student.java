public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String firstName, String lastName, int grade, int feesTotal) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.feesPaid = 0;
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

    public void payFees(int amount, School school) {
        feesPaid += amount;
        school.updateTotalMoneyEarned(amount);
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }
}
