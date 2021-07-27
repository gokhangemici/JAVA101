import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double kilo, boy, vki;
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = inp.nextDouble();

        vki = kilo / (boy * boy);
        System.out.println("Vücut kitle endeksiniz: " + vki);

    }
}
