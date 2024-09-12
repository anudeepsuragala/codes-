package streamsPractice;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practisequestions {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11,22,3,3,5,5,5,3,4,5);


        double s1= nums.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(s1);



        List<String> names= Arrays.asList("Anudeep","Annaya","Avinash","Arjun","Janan","Soni");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filteredNames);


        Map<Integer, Long> freqmap = nums.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(freqmap);








    }
}
