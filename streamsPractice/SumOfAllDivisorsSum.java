package streamsPractice;

public class SumOfAllDivisorsSum {

    public static int findSumOfDivisors(int n){
        int sum =0;
        if(n==1){
            sum =1;
            return sum;
        }
        for(int i=2; i*i<=n; i++){
            System.out.println("---"+i);
            if(n%i==0){
                sum = sum+i;
            }
        }
//        System.out.println("---sum"+sum);
        return sum+n+1;
    }
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        System.out.println(findSumOfDivisors(6));
//        for(int i=1;i<=n;i++){
//
//            sum = sum + findSumOfDivisors(i);
////            System.out.println(sum);
//        }

        System.out.println(sum);
    }
}
