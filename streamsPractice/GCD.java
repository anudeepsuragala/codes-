package streamsPractice;

public class GCD {

    public static Long[] getGcd(Long n1, Long n2){
        Long gcd = 1L;
        Long[] arr = new Long[2];
        Long prod = n1*n2;
        for(long i=1L;i<Math.max(n1, n2)/2; i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
//                System.out.println(gcd);
            }
        }
        arr[0]=prod/gcd;
        arr[1]=gcd;
        return arr;
    }
    public static void main(String[] args) {

        Long[] res = getGcd(4500L, 450L);
        for(Long i: res){
            System.out.println(i);
        }

//        int n1 = 12,n2=6,i=2,gcd=1;
//
//
//
//        while (n1>1 && n2>1){
//            boolean check = false;
//            if(n1%i==0 && n2%i==0) {
////                System.out.println("if-n1 ="+n1+" n2="+n2);
//                gcd = i;
//                n1=n1/i;
//                n2=n2/i;
//                check = true;
//            } else if (n1%i==0) {
////                System.out.println("elseif1-n1 ="+n1+" n2="+n2);
//                n1=n1/i;
//                check = true;
//
//            } else if (n2%i==0) {
////                System.out.println("elsesif2-n1 ="+n1+" n2="+n2);
//                n2 = n2 / i;
//                check = true;
//            }
////            System.out.println("n1 ="+n1+" n2="+n2);
//            if(!check){
//                i++;
//            }
//        }
//
//        System.out.println(gcd);
    }
}
