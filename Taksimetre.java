import java.util.Scanner;

public class Taksimetre{
    public static void main(String[] args) {
        double tutar, minimumtutar = 20, acilisucret = 10, km = 2.20;

        System.out.println("Welcome To World-Taksi!");
        System.out.print("Nereye Gideceksiniz? (KM) :  ");
        Scanner input = new Scanner(System.in);
        double kac_km = input.nextDouble();


        if (kac_km < 10){;
            System.out.println("Ödenecek Tutar :"+ minimumtutar +"₺");
            System.out.println("Yolculuk Sona Erdi! İyi Günler Dileriz!");
        }else if (kac_km > 10) {
            tutar = (kac_km * km)+acilisucret;
            System.out.println("Ödenecek Tutar: "+tutar +"₺");
            System.out.println("Yolculuk Sona Erdi! İyi Günler Dileriz!");
        }else{
            System.out.println("Yolculuk İptal Edildi! Teşekkürler");
        }

    }
}