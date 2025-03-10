public class Teacher {
    int id;
    String firstName;
    String lastName;
    int salary;
    int salaryEarned;

    public Teacher(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
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

    public void receiveSalary(int amount) {
        salaryEarned += amount;
    }

}
