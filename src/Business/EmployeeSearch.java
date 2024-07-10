package Business;

import Model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeSearch {
    public static void searchEmployeeById(ArrayList<Employee> employeeList, Scanner scanner) {
        System.out.print("Nhập mã nhân viên: ");
        String id = scanner.nextLine();

        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                System.out.println(employee);
                return;
            }
        }

        System.out.println("Không tìm thấy nhân viên với mã: " + id);
    }

    public static void searchEmployeesByIncome(ArrayList<Employee> employeeList, Scanner scanner) {
        System.out.print("Nhập mức thu nhập tối thiểu: ");
        double minIncome = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Danh sách nhân viên có thu nhập từ " + minIncome + ":");
        for (Employee employee : employeeList) {
            if (employee.getIncome() >= minIncome) {
                System.out.println(employee);
            }
        }
    }
}
