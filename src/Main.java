public class Main {
    public static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов Иван Иванович", 1, 25000);
        Employee employee2 = new Employee("Петров Иван Иванович", 2, 30000);
        Employee employee3 = new Employee("Сидоров Иван Иванович", 3, 35000);
        Employee employee4 = new Employee("Иванов Петр Иванович", 4, 40000);
        Employee employee5 = new Employee("Петров Петр Иванович", 5, 60000);
        Employee employee6 = new Employee("Сидоров Петр Иванович", 1, 65000);
        Employee employee7 = new Employee("Иванов Иван Петрович", 2, 20000);
        Employee employee8 = new Employee("Петров Иван Петрович", 3, 25000);
        Employee employee9 = new Employee("Сидоров Иван Петрович", 4, 30000);
        Employee employee10 = new Employee("Кузнецов Иван Иванович", 5, 55000);

        employee1.addEmployee();
        employee2.addEmployee();
        employee3.addEmployee();
        employee4.addEmployee();
        employee5.addEmployee();
        employee6.addEmployee();
        employee7.addEmployee();
        employee8.addEmployee();
        employee9.addEmployee();
        employee10.addEmployee();

        Service.printEmployees(employees);
        Service.printSummarySalary(employees);
        Service.printAverageSalary(employees);
        Service.printFullname(employees);
        Service.printMinimalSalary(employees);
        Service.printMaximalSalary(employees);
    }
}