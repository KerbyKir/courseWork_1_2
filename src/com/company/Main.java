package com.company;

public class Main {

    public static void main(String[] args) {
        Employee [] employee = new Employee[10];
        Employee worker1 = new Employee("Ivan","Dep1",20_002);
        Employee worker2 = new Employee("Sergey","Dep1",30_001);
        employee[0] = worker1;
        employee[1] = worker2;

        System.out.println("Спиков сотрудников:\n"+getListEmployee(employee));
        System.out.println("Сумма затрат на зарплаты в месяц: "+getSumSalaryInMonth(employee));
        System.out.println("Сотрудник с минимальной зарплатой:\n"+getEmployeeWIthMinSalary(employee));
        System.out.println("Сотрудник с максимальной зарплатой:\n"+getEmployeeWIthMaxSalary(employee));
        System.out.println("Среднее значение зарплат: "+getAvgSalary(employee));
        getListFIO(employee);
    }

    public static String getListEmployee(Employee [] employee) {

        StringBuilder listEmployee = new StringBuilder();

        for (Employee value : employee) {
            if(value != null) {
                listEmployee.append(value)
                        .append("\n");
            }
        }

        return listEmployee.toString();
    }

    public static long getSumSalaryInMonth(Employee [] employee) {
        long sumSalaryInMonth = 0L;

        for (Employee value : employee) {
            if(value != null) {
                sumSalaryInMonth += value.getSalary();
            }
        }

        return sumSalaryInMonth;
    }

    public static String getEmployeeWIthMinSalary(Employee [] employee) {
        String employeeWIthMinSalary = "";
        int minSalary=0;

        for (Employee value : employee) {
            if(value != null && (minSalary==0 || value.getSalary()<minSalary)) {
                minSalary=value.getSalary();
                employeeWIthMinSalary=value.toString();
            }
        }

        return employeeWIthMinSalary;
    }

    public static String getEmployeeWIthMaxSalary(Employee [] employee) {
        String employeeWIthMaxSalary = "";
        int maxSalary=0;

        for (Employee value : employee) {
            if(value != null && value.getSalary()>maxSalary) {
                maxSalary=value.getSalary();
                employeeWIthMaxSalary=value.toString();
            }
        }

        return employeeWIthMaxSalary;
    }

    public static float getAvgSalary(Employee [] employee) {
        int amountEmployees = 0;

        for (Employee value : employee) {
            if(value != null) {
                amountEmployees++;
            }
        }

        return (float)getSumSalaryInMonth(employee) / amountEmployees;
    }

    public static void getListFIO(Employee [] employee) {
        StringBuilder listFIO = new StringBuilder();
        listFIO.append("Список ФИО сотрудников:\n");

        for (Employee value : employee) {
            if(value != null) {
                listFIO.append(value.getFIO())
                        .append("\n");
            }
        }

        System.out.println(listFIO);
    }
}
