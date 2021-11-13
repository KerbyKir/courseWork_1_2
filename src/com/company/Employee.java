package com.company;

public class Employee {
    private String FIO;
    private String nameDepartment;
    private int salary;
    private int id;

    private static int counterId = 1;

    private int getCounterId() {
        int newId=counterId;
        counterId++;
        return newId;
    }

    public Employee(String FIO, String nameDepartment, int salary) {
        this.FIO = FIO;
        this.nameDepartment = nameDepartment;
        this.salary = salary;
        this.id = getCounterId();
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getFIO() {
        return FIO;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    @Override
    public String toString() {
        return "id: " + getId() + ",\n" +
                "ФИО: " + getFIO() + ",\n" +
                "Департамент: " + getNameDepartment() + ",\n" +
                "Зар.плата: " + getSalary() + "\n";
    }
}
