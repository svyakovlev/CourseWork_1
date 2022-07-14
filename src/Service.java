public class Service {
    public static int employesCount(Employee[] employees) {
        int employesCount = 0;
        for (int i = 0; i < Main.employees.length && employees[i] != null; i++) {
            employesCount++;
        }
        return employesCount;
    }
    public static void printEmployees(Employee[] employees) {
        for (int i = 0; i < employesCount(employees); i++) {
            System.out.println(employees[i]);
        }
    }

    public static void printSummarySalary(Employee[] employees) {
        double summarySalary = 0;
        double summ = 0;
        for (int i = 0; i < employesCount(employees); i++) {
            summarySalary = summ + employees[i].getSalary();
            summ = summarySalary;
        }
        System.out.println("Сумма затрат на зарплаты в месяц " + summ + " руб.");
    }

    public static void printAverageSalary(Employee[] employees) {
        double summarySalary = 0;
        double summ = 0;
        for (int i = 0; i < employesCount(employees); i++) {
            summarySalary = summ + employees[i].getSalary();
            summ = summarySalary;
        }
        double averageSalary = summ / employesCount(employees);
        System.out.println("Среднее значение зарплат " + averageSalary + " руб.");
    }

    public static void printFullname(Employee[] employees) {
        for (int i = 0; i < employesCount(employees); i++) {
            System.out.println(employees[i].getFullName());
        }
    }

    public static void printMinimalSalary(Employee[] employees) {
        double minimalSalary = employees[0].getSalary();
        String minSalaryFullname = employees[0].getFullName();
        for (int i = 0; i < employesCount(employees); i++) {
            if (employees[i].getSalary() < minimalSalary) {
                minimalSalary = employees[i].getSalary();
                minSalaryFullname = employees[i].getFullName();
            }
        }
        System.out.println("Минимальная зарплата " + minimalSalary + " руб. у сотрудника: " + minSalaryFullname);
    }
    public static void printMaximalSalary(Employee[] employees) {
        double maximalSalary = employees[0].getSalary();
        String maxSalaryFullname = employees[0].getFullName();
        for (int i = 0; i < employesCount(employees); i++) {
            if (employees[i].getSalary() > maximalSalary) {
                maximalSalary = employees[i].getSalary();
                maxSalaryFullname = employees[i].getFullName();
            }
        }
        System.out.println("Максимальная зарплата " + maximalSalary + " руб. у сотрудника: " + maxSalaryFullname);
    }
}
