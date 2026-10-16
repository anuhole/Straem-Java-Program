import java.util.Arrays;
import java.util.List;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int min=l1.stream()
                .mapToInt(n->n)
                .min()
                .orElse(0);

        int max=l1.stream()
                .mapToInt(n->n)
                .max()
                .orElse(0);

        System.out.println("Mininum number is: "+min);
        System.out.println("Maxinum number is: "+max);
    }
}
