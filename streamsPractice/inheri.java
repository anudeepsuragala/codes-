package streamsPractice;

public class inheri {
    class A
    {
        {
            System.out.println(1);
        }
    }

    class B extends A
    {
        {
            System.out.println(2);
        }
    }

    class C extends B
    {
        {
            System.out.println(3);
        }
    }


        public void main(String[] args)
        {
            C c = new C();
        }
    }

