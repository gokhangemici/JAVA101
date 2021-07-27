import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner inp = new Scanner(System.in);

        System.out.print("İlk sayiyi gir: ");
        n1 = inp.nextInt();
        System.out.print("İkinci sayiyi gir: ");
        n2 = inp.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seciminiz: ");
        select = inp.nextInt();

        /*
        if(select == 1)
        {
            System.out.println("Toplam: " + (n1 + n2));
        }
        else if(select == 2)
        {
            System.out.println("Fark: " + (n1 - n2));
        }
        else if(select == 3)
        {
            System.out.println("Carpma: " + (n1 * n2));
        }
        else if(select == 4)
        {
            if(n2 != 0)
            {
                System.out.println("Bölme: " + (n1 / n2));
            }
            else
            {
                System.out.println("Bir sayi 0'a bölünemez.");
            }
        }
        else
        {
            System.out.println("Hatali bir secim yaptiniz! Tekrar Deneyiniz.");
        }
         */
        switch (select)
        {
            case 1:
                System.out.println("toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("fark: " + (n1 - n2));
                break;
            case 3:
                System.out.println("carpma: " + (n1 * n2));
                break;
            case 4:
                if(n2 != 0)
                {
                    System.out.println("bölme: " + (n1 / n2));
                }
                else
                {
                    System.out.println("Bir sayi 0'a bölünemez");
                }
                break;
            default:
                System.out.println("Yanlis seçim yaptınız! Tekrar deneyiniz!");


        }
    }
}
