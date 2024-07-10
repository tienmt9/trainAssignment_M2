package Business;

import Model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeOperations {
    public static void deleteEmployeeById(ArrayList<Employee> employeeList, Scanner scanner) {
        System.out.print("Nhập mã nhân viên: ");
        String id = scanner.nextLine();

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)) {
                employeeList.remove(i);
                System.out.println("Đã xóa nhân viên với mã: " + id);
                return;
            }
        }

        System.out.println("Không tìm thấy nhân viên với mã: " + id);
    }

    public static void updateEmployeeById(ArrayList<Employee> employeeList, Scanner scanner) {
        System.out.print("Nhập mã nhân viên: ");
        String id = scanner.nextLine();

        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                System.out.print("Nhập tên mới: ");
                String name = scanner.nextLine();
                System.out.print("Nhập vị trí công việc mới: ");
                String position = scanner.nextLine();
                System.out.print("Nhập lương cơ bản mới: ");
                double salary = scanner.nextDouble();
                scanner.nextLine();

                employee.setName(name);
                employee.setPosition(position);
                employee.setSalary(salary);

                System.out.println("Đã cập nhật thông tin nhân viên với mã: " + id);
                return;
            }
        }

        System.out.println("Không tìm thấy nhân viên với mã: " + id);
    }}
