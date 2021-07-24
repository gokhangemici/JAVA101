package Giris;


import java.util.Scanner;

public class AlanHesaplama {
    public static void main(String[] args) {

        int a, b, c, cevre, u;
        double  alan;
        Scanner inp = new Scanner(System.in);
        System.out.print("1.kenari gir: ");
        a = inp.nextInt();
        System.out.print("2.kenarı gir: ");
        b = inp.nextInt();
        System.out.print("3.kenari gir: ");
        c = inp.nextInt();

        cevre = a + b + c;
        u = cevre / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Ucgenin alani: " + alan);


    }
}
