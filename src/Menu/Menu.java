package Menu;

import Business.*;
import Model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static ArrayList<Employee> employeeList = new ArrayList<>();

    public void display() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==========");
            System.out.println("Employee Management System");
            System.out.println("1. Nhập danh sách nhân viên");
            System.out.println("2. Xuất danh sách nhân viên");
            System.out.println("3. Tìm nhân viên theo mã");
            System.out.println("4. Xóa nhân viên theo mã");
            System.out.println("5. Cập nhật thông tin nhân viên theo mã");
            System.out.println("6. Tìm nhân viên theo thu nhập");
            System.out.println("7. Sắp xếp nhân viên");
            System.out.println("8. Xuất 5 nhân viên có thu nhập cao nhất");
            System.out.println("9. Lưu danh sách nhân viên xuống file");
            System.out.println("10. Đọc danh sách nhân viên từ file");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            Button button = new Button();
            button.ButtonChoice(employeeList, scanner, choice);
        } while (choice != 0);
        scanner.close();
    }
}
