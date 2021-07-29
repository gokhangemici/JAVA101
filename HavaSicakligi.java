import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz: ");
        heat = inp.nextInt();

        if(heat < 5)
        {
            System.out.println("Kayak yapabilirsiniz!");
        }
        else if(heat >= 5 && heat <= 15)
        {
            System.out.println("Sinemaya gidebilirsiniz!");
        }
        else if(heat >= 15 && heat <= 25)
        {
            System.out.println("Piknige gidebilirsiniz!");
        }
        else
        {
            System.out.println("Yüzmeye gidebilirsiniz!");
        }



    }
}
