
import java.util.Scanner;

public class Kalkulator {

    public static double v1;
    public static double v2;

    public static double tambahBilangan() {
    return v1 + v2;
    }

    public static double kurangBilangan() {
    return v1 - v2;
    }

    public static double kaliBilangan() {
      return v1 * v2;
    }

    public static double bagiBilangan() {
       return v1 / v2 ;
    }

    public static double sisaBilangan() {
       return v1 % v2;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
    
    //input
    System.out.println("=====Aplikasi Kalkulator=====");
    System.out.print("Masukkan nilai ke-1 : ");
    v1 = scanner.nextDouble();
    System.out.print("Masukkan nilai ke-2 : ");
    v2 = scanner.nextDouble();
    
    //output
    
    System.out.println("\nHasil Pertambahan : " + tambahBilangan());
    System.out.println("Hasil Pengurangan : " + kurangBilangan());
    System.out.println("Hasil Perkalian : " + kaliBilangan());
    System.out.println("Hasil Pembagian : " + bagiBilangan());
    System.out.println("Hasil Sisa : " + sisaBilangan());
    
    }
    
}
