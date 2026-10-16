import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream10 {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("mango","kivi","strawberry","peach","papaya","pear");

        Map<Boolean,List<String>> partionbyWords =words.stream()
                .collect(Collectors.partitioningBy(string -> string.length() >5));

        System.out.println("Word is  graether than 5  "+partionbyWords.get(true));
        System.out.println("Word is less than 5 "+partionbyWords.get(false));
    }
}
