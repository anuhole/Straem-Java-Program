import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Stream3 {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("Anushka","bat","ball","cat","dog","icecream","boy","Bed","BAY");

        List<String> re=words.stream()
                .filter(str ->str.startsWith("b") && str.length() == 3)
                .collect(Collectors.toList());

        System.out.println(" List is "+re);
    }
}
