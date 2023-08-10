import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {

        int km;
        double perkm=2.20 , total = 10 ;

        Scanner giris = new Scanner(System.in);

        System.out.println("Km giriniz:");
        km = giris.nextInt();

        total = km * perkm + total ;

        System.out.println("Toplam tutar :" + total);

    }
}