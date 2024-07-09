import java.util.ArrayList;

public class EmployeeDisplay {
    public static void displayEmployeeList(ArrayList<Employee> employeeList) {
        System.out.println("Danh sách nhân viên:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public static void displayTop5EmployeesByIncome(ArrayList<Employee> employeeList) {
        employeeList.sort((e1, e2) -> Double.compare(e2.getIncome(), e1.getIncome()));
        System.out.println("Top 5 nhân viên có thu nhập cao nhất:");
        for (int i = 0; i < Math.min(5, employeeList.size()); i++) {
            System.out.println(employeeList.get(i));
        }
    }
}
