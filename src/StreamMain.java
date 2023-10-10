import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class StreamMain {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        list.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

        List<Integer> listA = new ArrayList<>();
        for (Integer el:list) {
            if(el > 0 && el % 2 == 0){
                listA.add(el);
            }
        }
        listA.sort(Comparator.naturalOrder());
        for (Integer el:listA) {
            if(el > 0 && el % 2 == 0){
                System.out.println(el);
            }
        }

//    IntStream.of(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4)
//            .filter(x -> x > 0)
//            .filter(x -> x % 2 == 0)
//            .sorted()
//            .forEach(System.out::println);
    }

}