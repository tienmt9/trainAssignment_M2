package Business;

import Model.Employee;

import java.util.ArrayList;

public class EmployeeSorter {
    public static void sortEmployees(ArrayList<Employee> employeeList) {
        // Sort by employee ID
        employeeList.sort((e1, e2) -> e1.getId().compareTo(e2.getId()));
        System.out.println("Danh sách nhân viên sau khi sắp xếp theo mã nhân viên:");
        EmployeeDisplay.displayEmployeeList(employeeList);

        // Sort by income
        employeeList.sort((e1, e2) -> Double.compare(e2.getIncome(), e1.getIncome()));
        System.out.println("Danh sách nhân viên sau khi sắp xếp theo thu nhập:");
        EmployeeDisplay.displayEmployeeList(employeeList);
    }
}
