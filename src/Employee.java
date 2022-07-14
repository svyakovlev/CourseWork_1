public class Employee {
    private String fullName;
    private int department;
    private double salary;
    private int id;
    private static int counter;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = getCounter();
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public void addEmployee() {
        for (int i = 0; i <= Main.employees.length; i++) {
            if (Main.employees[i] == null) {
                Main.employees[i] = this;
                break;
            }
        }
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
            return "ФИО: " + this.fullName + ", " +
                   "отдел: " + this.department + ", " +
                   "зарплата: " + this.salary + ", " +
                   "id: " + this.id;
    }
}
