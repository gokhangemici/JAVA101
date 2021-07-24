package Giris;

import java.util.Scanner;

public class NotOrtalamasi {


    //burası program başlangıç yeri
    public static void main(String[] args) {
        // System.out.println("gokhan nasılsın");
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik notunu giriniz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6;
        System.out.println("Ortalamanız: " + ortalama);
        String sonuc = (ortalama > 60) ? "Sinifi gecti" : "Sinifta kaldi";
        System.out.println("Sonuc: " + sonuc);


    }
}
