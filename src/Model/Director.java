package Model;

public class Director extends Employee {
    public Director(String id, String name, String position, double salary) {
        super(id, name, position, salary);
    }

    @Override
    public double getIncome() {
        return getSalary() * 1.5;
    }

    @Override
    public String toString() {
        return getId() + "," + getName() + "," + getPosition() + "," + getSalary() + ",4";
    }

    public static Director fromString(String line) {
        String[] parts = line.split(",");
        String id = parts[0];
        String name = parts[1];
        String position = parts[2];
        double salary = Double.parseDouble(parts[3]);
        return new Director(id, name, position, salary);
    }
}
