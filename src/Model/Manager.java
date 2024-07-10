package Model;

public class Manager extends Employee {
    public Manager(String id, String name, String position, double salary) {
        super(id, name, position, salary);
    }

    @Override
    public double getIncome() {
        return getSalary() * 1.2;
    }

    @Override
    public String toString() {
        return getId() + "," + getName() + "," + getPosition() + "," + getSalary() + ",2";
    }

    public static Manager fromString(String line) {
        String[] parts = line.split(",");
        String id = parts[0];
        String name = parts[1];
        String position = parts[2];
        double salary = Double.parseDouble(parts[3]);
        return new Manager(id, name, position, salary);
    }
}
