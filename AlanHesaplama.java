package Giris;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class AlanHesaplama {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, c, cevre, u, alan;

        System.out.print("1.kenari gir: ");
        a = inp.nextInt();
        System.out.print("2.kenari gir: ");
        b = inp.nextInt();
        System.out.print("3.kenari gir: ");
        c = inp.nextInt();

        cevre = a + b + c;
        u = cevre / 2;
        alan = u * (u - a) * (u - b) * (u - c);
        System.out.println("Alan: " + alan);
    }
}
