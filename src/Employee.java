public class Employee {
    int id;
    String name;
    double salary;
    String depName;
    String deg;

    public Employee() {
    }


    public Employee(int id, String name, double salary, String depName, String deg) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.depName = depName;
        this.deg = deg;
    }

    public String getDeg() {
        return deg;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepName() {
        return depName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", depName='" + depName + '\'' +
                ", deg='" + deg + '\'' +
                '}';
    }


}
