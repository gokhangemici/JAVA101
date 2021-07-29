import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int mat, fizik, kimya, turkce, muzik;
        double ortalama;
        System.out.print("Matematik notu: ");
        mat = inp.nextInt();
        System.out.print("Fizik notu: ");
        fizik = inp.nextInt();
        System.out.print("Kimya notu: ");
        kimya = inp.nextInt();
        System.out.print("Turkce notu: ");
        turkce = inp.nextInt();
        System.out.print("Muzik notu: ");
        muzik = inp.nextInt();
        ortalama = (mat + fizik + kimya + turkce + muzik) / 5;




        System.out.println("Ortalamanız: " + ortalama);
    }
}
