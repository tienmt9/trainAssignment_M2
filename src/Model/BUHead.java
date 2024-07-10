package Model;

public class BUHead extends Employee {
    public BUHead(String id, String name, String position, double salary) {
        super(id, name, position, salary);
    }

    @Override
    public double getIncome() {
        return getSalary() * 1.3;
    }

    @Override
    public String toString() {
        return getId() + "," + getName() + "," + getPosition() + "," + getSalary() + ",3";
    }

    public static BUHead fromString(String line) {
        String[] parts = line.split(",");
        String id = parts[0];
        String name = parts[1];
        String position = parts[2];
        double salary = Double.parseDouble(parts[3]);
        return new BUHead(id, name, position, salary);
    }
}
