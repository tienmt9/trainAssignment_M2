import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EmployeeFileHandler {
    public static void saveEmployeeListToFile(ArrayList<Employee> employeeList, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Employee employee : employeeList) {
                writer.write(employee.toString() + "\n");
            }
            System.out.println("Lưu danh sách nhân viên thành công");
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra khi lưu danh sách nhân viên: " + e.getMessage());
        }
    }

    public static void readEmployeeListFromFile(ArrayList<Employee> employeeList, String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String id = parts[0];
                    String name = parts[1];
                    String position = parts[2];
                    double salary = Double.parseDouble(parts[3]);

                    Employee employee = new Employee(id, name, position, salary);
                    employeeList.add(employee);
                } else if (parts.length == 5) {
                    String id = parts[0];
                    String name = parts[1];
                    String position = parts[2];
                    double salary = Double.parseDouble(parts[3]);
                int type = Integer.parseInt(parts[4]);

                Employee employee;
                switch (type) {
                    case 2:
                        employee = Manager.fromString(line);
                        break;
                    case 3:
                        employee = BUHead.fromString(line);
                        break;
                    case 4:
                        employee = Director.fromString(line);
                        break;
                    default:
                        employee = Employee.fromString(line);
                        break;
                }
                employeeList.add(employee);
            }
        }
        System.out.println("Đọc danh sách nhân viên thành công");
    } catch(
    IOException e)

    {
        System.out.println("Có lỗi xảy ra khi đọc danh sách nhân viên: " + e.getMessage());
    }
}
}
