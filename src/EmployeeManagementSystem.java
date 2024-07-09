import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {
    private static ArrayList<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
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
        } while (choice != 0);

        scanner.close();
    }
}
