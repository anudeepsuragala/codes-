package streamsPractice;

public class Vowles {

    public static void main(String[] args) {
        String s = "aaauaaa";

        int sp =0, ep = s.length()-1,itr=0,c=0, n = s.length();
        if (s.length()%2!=0){
            if(s.charAt(n/2) == 'a' || s.charAt(n/2) == 'e' || s.charAt(n/2) == 'i' || s.charAt(n/2) == 'o' || s.charAt(n/2) == 'u'){
                c++;
                System.out.println(s.charAt(n/2));
            }
        }
        while(ep>sp){
            itr++;
            if(s.charAt(sp) == 'a' || s.charAt(sp) == 'e' || s.charAt(sp) == 'i' || s.charAt(sp) == 'o' || s.charAt(sp) == 'u'){
                c++;
                System.out.println("sp "+s.charAt(sp));
            }

            if(s.charAt(ep) == 'a' || s.charAt(ep) == 'e' || s.charAt(ep) == 'i' || s.charAt(ep) == 'o' || s.charAt(ep) == 'u'){
                c++;
                System.out.println("ep "+ s.charAt(ep));
            }

            sp++;
            ep--;


        }

        System.out.println(c);
        System.out.println("ITR "+ itr);
    }
}
