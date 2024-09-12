package streamsPractice;

public class vow {
    //4444444
    //4333334
    //4322234
    //4321234
    //4322234

    public static void main(String[] args) {

        int n = 4;
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j <2*n-1; j++) {
                if(i==0 || i==n*2-2 || j==0 || j==n*2-2){
                    System.out.print(n);
                } else {
                    int minDis1 = Math.abs(Math.min(Math.abs(i -( n * 2 - 2)), Math.abs(i)));
                    int minDis2 = Math.abs(Math.min(Math.abs(j - (n * 2 - 2)), Math.abs(j)));
//                    System.out.println(minDis1+ " - "+ minDis2);
                    int minDis = Math.abs(Math.min(minDis1, minDis2));
                    System.out.print(Math.abs(n - minDis));
                }
            }

//            for (int j=mid-1;j>i;j--){
//                System.out.print(c);
////            }
//            c--;
            System.out.println("");
        }
    }
}





//                    if(i==0 || i==s-1) {
//                        System.out.print(mid);
//
//                    } else {
//                        if(j==sp-c || j==s-1){
//                            System.out.print(mid);
//                        } else
//                            System.out.print(mid-sp);
//                    }
//
//                }
//                sp++;
//                c++;
//                c--;
//                System.out.println("");
//
//
//        }
//    }

