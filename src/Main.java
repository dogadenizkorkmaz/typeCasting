import java.util.Scanner;

public class Main {
     public static void main(String[] args) {

        int n1;
        double n2;

         Scanner doa = new Scanner(System.in); //define scanner

         System.out.print("Tam Sayı Giriniz: "); //get value from user
         n1 = doa.nextInt();

         System.out.print("Ondalık Sayı Giriniz (örn:1,7): "); //get value from user
         n2 = doa.nextDouble();

         double n1Casting = n1;// type casting
         int n2Casting = (int) n2;// type casting

         System.out.println("Explicit Narrowing: " + n1Casting);     //ya da; System.out.println("Integer ifade, Double ifadeye dönüştürüldü.Sonuç: " + (double) n1);
         System.out.println("Auto Widening: " + n2Casting);          //ya da ; System.out.println("Double ifade, Integer ifadeye dönüştürüldü.Sonuç: " +(int) n2);
     }
}
