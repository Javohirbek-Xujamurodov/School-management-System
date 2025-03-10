public class Teacher {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.salaryEarned = 0;
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

    public int getSalary() {
        return salary;
    }

    public void receiveSalary(School school) {
        salaryEarned += salary;
        school.updateTotalMoneySpent(salary);
    }
}
