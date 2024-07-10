package Menu;

import Business.*;
import Model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Button {
    public void ButtonChoice(ArrayList<Employee> employeeList, Scanner scanner, int choice) {
        switch (choice) {
            case 1:
                EmployeeInput.inputEmployeeList(employeeList, scanner);
                break;
            case 2:
                EmployeeDisplay.displayEmployeeList(employeeList);
                break;
            case 3:
                EmployeeSearch.searchEmployeeById(employeeList, scanner);
                break;
            case 4:
                EmployeeOperations.deleteEmployeeById(employeeList, scanner);
                break;
            case 5:
                EmployeeOperations.updateEmployeeById(employeeList, scanner);
                break;
            case 6:
                EmployeeSearch.searchEmployeesByIncome(employeeList, scanner);
                break;
            case 7:
                EmployeeSorter.sortEmployees(employeeList);
                break;
            case 8:
                EmployeeDisplay.displayTop5EmployeesByIncome(employeeList);
                break;
            case 9:
                EmployeeFileHandler.saveEmployeeListToFile(employeeList, "src/data.txt");
                break;
            case 10:
                EmployeeFileHandler.readEmployeeListFromFile(employeeList, "src/data.txt");
                break;
            case 0:
                System.out.println("Thoát");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
                break;
        }
    }
}
