package streamsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(5);
        nums.add(4);

        int[] intArray = new int[5];
        intArray[0]= 1;
        intArray[1]=2;
        intArray[2]=5;

        int s1 = nums.stream().mapToInt(e->e).sum();
        System.out.println(s1);


        int s2 = Arrays.stream(intArray).sum();
        System.out.println(s2);

    }
}
