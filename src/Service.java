public class Service {
    public static int employesCount(Employee[] employees) {
        int employesCount = 0;
        for (Employee employee : employees) {
            if (employee != null) employesCount++;
        }
        return employesCount;
    }

    public static void printEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }
    public static void printDeptEmployees(Employee[] employees, int dept) {
        System.out.println("Сотрудники отдела №" + dept + ":");
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == dept) {
                count++;
                System.out.println(employees[i].getFullName() + ", зарплата " + employees[i].getSalary() + " руб., id " + employees[i].getId());
            }
        }
        if (count == 0) {
            System.out.println("Нет сотрудников");
        }
    }
    public static void printSummarySalary(Employee[] employees) {
        double summarySalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                summarySalary = summarySalary + employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц " + summarySalary + " руб.");
    }

    public static void printAverageSalary(Employee[] employees) {
        double summarySalary = 0;
        double averageSalary;
        int employesCount = employesCount(employees);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                summarySalary = summarySalary + employees[i].getSalary();
            }
        }
        averageSalary = summarySalary / employesCount;
        System.out.println("Среднее значение зарплат " + averageSalary + " руб.");
    }

    public static void printFullname(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }

    public static void printMinimalSalary(Employee[] employees) {
        double minimalSalary = employees[0].getSalary();
        String minSalaryFullname = employees[0].getFullName();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < minimalSalary) {
                minimalSalary = employees[i].getSalary();
                minSalaryFullname = employees[i].getFullName();
            }
        }
            System.out.println("Минимальная зарплата " + minimalSalary + " руб. у сотрудника: " + minSalaryFullname);
        }

    public static void printMaximalSalary(Employee[] employees) {
        double maximalSalary = employees[0].getSalary();
        String maxSalaryFullname = employees[0].getFullName();
        if (employees[0] != null) {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getSalary() > maximalSalary) {
                    maximalSalary = employees[i].getSalary();
                    maxSalaryFullname = employees[i].getFullName();
                }
            }
            System.out.println("Максимальная зарплата " + maximalSalary + " руб. у сотрудника: " + maxSalaryFullname);
        } else {
            System.out.println("Нет сотрудников printMaximalSalary");
        }
    }

    public static void salaryIndexingForAll(Employee[] employees, int percent) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].setSalary(employees[i].getSalary() * (100 + percent)/100);
            }
        }
    }
    public static void salaryIndexingForDept(Employee[] employees, int dept, int percent) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == dept) {
                employees[i].setSalary(employees[i].getSalary() * (100 + percent)/100);
            }
        }
    }
    public static void printMinimalSalaryInDept(Employee[] employees, int dept) {
        double minSalaryInDept = 0;
        String minSalaryInDeptFullname = "нет сотрудника";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == dept) {
                minSalaryInDept = employees[i].getSalary();
                minSalaryInDeptFullname = employees[i].getFullName();
                break;
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == dept && employees[i].getSalary() < minSalaryInDept) {
                minSalaryInDept = employees[i].getSalary();
                minSalaryInDeptFullname = employees[i].getFullName();
            }
        }
        System.out.println("Минимальная зарплата " + minSalaryInDept + " руб." + " в отделе №" + dept + " у сотрудника: " + minSalaryInDeptFullname);
    }
    public static void printMaximalSalaryInDept(Employee[] employees, int dept) {
        double maxSalaryInDept = 0;
        String maxSalaryInDeptFullname = "нет сотрудника";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == dept) {
                maxSalaryInDept = employees[i].getSalary();
                maxSalaryInDeptFullname = employees[i].getFullName();
                break;
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == dept && employees[i].getSalary() > maxSalaryInDept) {
                maxSalaryInDept = employees[i].getSalary();
                maxSalaryInDeptFullname = employees[i].getFullName();
            }
        }
        System.out.println("Максимальная зарплата " + maxSalaryInDept + " руб." + " в отделе №" + dept + " у сотрудника: " + maxSalaryInDeptFullname);
    }
    public static void printSumDeptSalary(Employee[] employees, int dept) {
        double summaryDeptSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == dept) {
                summaryDeptSalary = summaryDeptSalary + employees[i].getSalary();
            }
        }
        System.out.println("Суммарная зарплата в отделе №"+ dept + ", " + summaryDeptSalary + " руб.");
    }
    public static void printAverageDeptSalary(Employee[] employees, int dept) {
        double summaryDeptSalary = 0;
        double averageDeptSalary = 0;
        int employesCount = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == dept) {
                summaryDeptSalary = summaryDeptSalary + employees[i].getSalary();
                employesCount++;
            }
        }
        if (employesCount == 0) {
            System.out.println("Нет такого отдела");
        } else {
            averageDeptSalary = summaryDeptSalary / employesCount;
            System.out.println("Среднее значение зарплат в отделе №"+ dept + ", " + averageDeptSalary + " руб.");
        }
    }

    public static void printSalaryMore(Employee[] employees, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() >= salary) {
                System.out.println(employees[i]);
            }
        }
    }
    public static void printSalaryLess(Employee[] employees, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < salary) {
                System.out.println(employees[i]);
            }
        }
    }
}
