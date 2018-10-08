package business;

public class Company {
   static int years = 10;
   static long capital = 120_000_000;
   static int employees = 350;

    public static void about(){
        System.out.println("The company is present on the market " + years + " ago.\n" +
                "It has a capital of: " + capital);
    }

    /*public static double calculateSalary(int experience, int hours_month, int earn){
          double salary = k * hours_month * earn;
          double k;
       k - koefitzient kotoryi zavisit ot opyta sled. obrazom:
              1..2 goda opyta - 0.25
              3..5 goda opyta - 0.55
              5..10 goda opyta - 0.90
              10..20 goda opyta - 1.00
    }*/
    //return salary;
}
