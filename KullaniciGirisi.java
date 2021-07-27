import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String userName, password, newPassword, secim;
        System.out.print("Kullanıcı adınız: ");
        userName = inp.nextLine();
        System.out.print("Şifreniz: ");
        password = inp.nextLine();

        if(userName.equals("patika") && password.equals("Java123"))
        {
            System.out.println("Giris yaptiniz!");

        }
        else
        {
            System.out.println("Bilgileriniz yanlis! ");
            System.out.println("Şifrenizi sıfırlamak istiyor musunuz? (e/h)");
            secim = inp.nextLine();
            if(secim.equals("h"))
            {
                System.out.println("program bitti! ");

            }
            else if(secim.equals("e"))
            {
                System.out.print("Yeni şifre giriniz: ");
                newPassword = inp.nextLine();
                if(newPassword != password)
                {
                    password = newPassword;
                    System.out.println("Şifre oluşturuldu! ");
                    System.out.println("Yeni şifre: " + password);
                }
                else
                {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz! ");
                }
            }

        }


    }
}
