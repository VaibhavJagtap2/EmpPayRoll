package com.emppayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpPayRollService {
    private List<EmpPayRollData> employeePayrollList;

    public EmpPayRollService(List<EmpPayRollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    private void writeEmployeePayrollData() {
        System.out.println("\nWriting Employee Payroll Roaster to Console\n " + employeePayrollList);
    }

    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee ID: ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name: ");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary: ");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmpPayRollData(id, name, salary));
    }
    public static void main (String[] args) {
        ArrayList<EmpPayRollData> employeePayrollList = new ArrayList<>();
        EmpPayRollService employeePayrollService = new EmpPayRollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }
}

