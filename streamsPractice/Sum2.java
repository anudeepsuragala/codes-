package streamsPractice;


import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Sum2 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,128888);
        int s1 = nums.stream().mapToInt(e->e).sum();
        System.out.println(s1);

        int[] intArray = {5,2,4,19,5};
        int s2 = Arrays.stream(intArray).sum();
        System.out.println(s2);



        int[] intArray1 = {8,4} ;
        int s3 = Arrays.stream(intArray1).reduce(1, (a,b)->a%b);
        System.out.println(s3);


        int[] intArray3 ={1001, 1081};
        int s4 = Arrays.stream(intArray3).max().getAsInt();
        System.out.println(s4);

    }
}
