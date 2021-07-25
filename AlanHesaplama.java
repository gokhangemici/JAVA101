package Giris;

import java.util.Scanner;

public class AlanHesaplama {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        int a, b, c, u, cevre;
        double alan;
        System.out.println("1.kenari gir: ");
        a = inp.nextInt();
        System.out.println("2.kenari gir: ");
        b = inp.nextInt();
        System.out.println("3.kenari gir: ");
        c = inp.nextInt();
        
        cevre = a + b + c;
        u = cevre / 2;
        alan = Math.sqrt((u * (u - a) * (u - b) * (u - c)));
        System.out.println("Üçgenin alani: " + alan);

    }
}
