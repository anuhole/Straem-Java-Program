import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> stud = new ArrayList<>();
        stud.add(new Student(101, "Anushka", 99));
        stud.add(new Student(102, "Prajakta", 50));
        stud.add(new Student(103, "savi", 90));
        stud.add(new Student(104, "Aswini", 80));
        stud.add(new Student(105, "Rajashree", 88));

        List<Student> score =stud.stream()
                .sorted(Comparator.comparing(Student::getMarks).reversed())
                .limit(3)
                .collect(Collectors.toList());

        List<Student> byName =stud.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        Set<Student> filterByName =stud.stream()
                .sorted(Comparator.comparing(Student::getName) )
                .filter((Student s)-> s.getName().length() == 4)
                .collect(Collectors.toSet());

        System.out.println("Students are: "+score);
        System.out.println("Sorted names are \n"+byName);
        System.out.println("names length are 4: "+filterByName);
    }
}
