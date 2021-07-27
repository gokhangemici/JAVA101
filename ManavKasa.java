import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double armut, elma, domates, muz, patlican, toplamTutar;
        double armutKilo = 2.14, elmaKilo = 3.67, domatesKilo = 1.11, muzKilo = 0.95, patlicanKilo = 5.00; //meyvelerin kilo fiyatları
        System.out.print("Armut kac kilo ? : ");
        armut = inp.nextDouble();
        System.out.print("Elma kac kilo ? : ");
        elma = inp.nextDouble();
        System.out.print("Domates kac kilo ? : ");
        domates = inp.nextDouble();
        System.out.print("Muz kac kilo ? : ");
        muz = inp.nextDouble();
        System.out.print("Patlican kac kilo ? : ");
        patlican = inp.nextDouble();
        toplamTutar = (armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlican * patlicanKilo);
        System.out.println("Toplam tutar: " + toplamTutar);

    }
}
