package Business;

import Model.BUHead;
import Model.Director;
import Model.Employee;
import Model.Manager;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeInput {
    public static void inputEmployeeList(ArrayList<Employee> employeeList, Scanner scanner) {
        System.out.println("Nhập danh sách nhân viên");
        System.out.print("Nhập số lượng nhân viên: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Nhập mã nhân viên: ");
            String id = scanner.nextLine();
            System.out.print("Nhập tên nhân viên: ");
            String name = scanner.nextLine();
            System.out.print("Nhập vị trí công việc: ");
            String position = scanner.nextLine();
            int type;
            do {
                System.out.print("Nhập loại nhân viên (1. Employee, 2. Manager, 3. BUHead, 4. Director): ");
                type = scanner.nextInt();
            } while (type < 1 || type > 4);
            System.out.print("Nhập lương cơ bản: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            Employee employee;
            switch (type) {
                case 2:
                    employee = new Manager(id, name, position, salary);
                    break;
                case 3:
                    employee = new BUHead(id, name, position, salary);
                    break;
                case 4:
                    employee = new Director(id, name, position, salary);
                    break;
                default:
                    employee = new Employee(id, name, position, salary);
                    break;
            }

            employeeList.add(employee);
        }
    }
}
