import java.util.Scanner;
public class TaksimetreHesaplama {

    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total = 10;
        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = inp.nextInt();
        total += km * perKm;
        total = (total < 20) ? 20: total;
        System.out.println("Toplam tutar: " + total);


    }
}
