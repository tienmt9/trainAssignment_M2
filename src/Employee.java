public class Employee {
    private String id;
    private String name;
    private String position;
    private double salary;

    public Employee(String id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getIncome() {
        return salary * 1.0;
    }

    public double getTax() {
        double income = getIncome();
        if (income < 9000000) {
            return 0;
        } else if (income <= 15000000) {
            return income * 0.1;
        } else {
            return income * 0.12;
        }
    }

    @Override
    public String toString() {
        return id + "," + name + "," + position + "," + salary + ",1";
    }

    public static Employee fromString(String line) {
        String[] parts = line.split(",");
        String id = parts[0];
        String name = parts[1];
        String position = parts[2];
        double salary = Double.parseDouble(parts[3]);
        return new Employee(id, name, position, salary);
    }
}

