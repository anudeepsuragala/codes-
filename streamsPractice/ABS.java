package streamsPractice;

    abstract class Sunstar {
        abstract void printInfo();
    }


    class Employee extends Sunstar {
        void printInfo()
        {
            String name = "avinash";
            int age = 21;
            float salary = 222.2F;
            Long pno= 8179502145L;

            System.out.println(name);
            System.out.println(age);
            System.out.println(salary);
            System.out.println(pno);
        }
    }


    class Base {
        public static void main(String args[])
        {
            Sunstar s = new Employee();
            s.printInfo();
        }
    }
