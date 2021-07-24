package Giris;

import java.util.Scanner;
public class KdvTutariHesaplama {

    public static void main(String[] args) {

        double tutar, kdvTutar, kdvliTutar, kdvOran;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutar giriniz: ");
        tutar = input.nextDouble();

        kdvOran = (tutar >= 0 && tutar <= 1000) ? 0.18 : 0.08;
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        System.out.println("KDV'siz fiyat: " + tutar);
        System.out.println("KDV orani: " + kdvOran);
        System.out.println("KDV tutar: " + kdvTutar);
        System.out.println("KDV'li fiyat: " + kdvliTutar);



    }
}
