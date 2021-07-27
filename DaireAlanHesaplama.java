import java.util.Scanner;
public class DaireAlanHesaplama {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // Yarıçapı r, merkez açısısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        int r, a;
        double pi = 3.14, alan;
        System.out.print("Yaricap giriniz: ");
        r = inp.nextInt();
        System.out.print("Merkez acisi olcusu giriniz: ");
        a = inp.nextInt();
        alan = (pi * (r * r) * a) / 360;
        System.out.println("Daire diliminin alani: " + alan);

    }
}
