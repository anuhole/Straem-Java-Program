import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestEmployee {
    public static void main(String[] args) {
        List<Employee> emp=new ArrayList<>();
        emp.add(new Employee(101,"Anushka",50000,"IT","Programmer"));
        emp.add(new Employee(102,"Tanvi",35000,"IT","Tester"));
        emp.add(new Employee(103,"Saavi ",30000,"HR","Programmer"));
        emp.add(new Employee(104,"Prajakta",45000,"Technical","Tester"));
        emp.add(new Employee(105,"Prasad",20000,"HR","Programmer"));

        List<Employee> S1 = emp.stream()
                .filter( (Employee s )->s.getDeg() == "Programmer" && s.getSalary() >20000)
                .collect(Collectors.toList());

        Employee maxSal=emp.stream()
                        .max(Comparator.comparing(Employee::getSalary))
                        .orElse(null);

        Employee minSal=emp.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .orElse(null);

        Map<String, List<String>> map1;

        map1 = emp.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepName,
                        Collectors.mapping(Employee::toString, Collectors.toList())
                ));

        System.out.println(" "+S1);
        System.out.println("Maximum Salry is: "+maxSal);
        System.out.println("Minimum Salry is: "+minSal);
        System.out.println("Emplyees are: "+map1);
    }
}
