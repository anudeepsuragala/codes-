package streamsPractice;

import javax.management.ObjectInstance;

public class AmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int len = String.valueOf(n).length();
        double res = 0;
        while(n>=1){
            int rem = n%10;
            res = res + Math.pow(rem, len);
            n = n/10;
            System.out.println(res);
        }
        System.out.println("n = "+n+ "res = "+(int)res);
        if (n == (int)res){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
