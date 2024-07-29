package Basic;  //Girilen kriterlere göre uçak bileti fiyatı hesaplanır
import java.util.Scanner;
public class UcakBiletiHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe,yas,yolculukTip;
        double mesafeBirim = 0.10,ucret;


        System.out.println("Mesafeyi km cinsinden giriniz: ");
        mesafe = input.nextInt();

        System.out.println("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.println("Yolculuk tipini giriniz ( 1 => Tek Yön , 2 => Gidiş Dönüş) :  ");
        yolculukTip = input.nextInt();

        ucret = mesafe * mesafeBirim ;


        if(mesafe > 0 && yas > 0  && (yolculukTip == 1 || yolculukTip == 2)){


            if(yolculukTip == 2){
                if (yas < 12){
                    System.out.println("Yapılan yaş indirimi: " + ucret * 0.5);
                    System.out.println("Yaş İndirimli Fiyatı: ");
                    System.out.println(ucret * 0.5);
                    System.out.println("Gidiş Dönüş İndirimi: " + (ucret*0.5) * 0.2);
                    System.out.println("Ödeceğiniz ücret: " + 2*(ucret - (ucret * 0.5 + (ucret*0.5) * 0.2)));


                } else if (yas > 12 && yas <= 24){
                    System.out.println("Yapılan yaş indirimi: " + ucret * 0.1);
                    System.out.println("Yaş İndirimli Fiyatı: ");
                    System.out.println(ucret * 0.9);
                    System.out.println("Gidiş Dönüş İndirimi: " + (ucret *0.9) * 0.2);
                    System.out.println("Ödeyeceğiniz ücret: " + 2*(ucret - (ucret * 0.1 + (ucret *0.9) * 0.2) ));


                } else if (yas > 65){
                    System.out.println("Yapılan yaş indirimi: " + ucret * 0.3);
                    System.out.println("Yaş İndirimli Fiyatı: ");
                    System.out.println(ucret * 0.7);
                    System.out.println("Gidiş Dönüş İndirimi: " + (ucret*0.7) * 0.2);
                    System.out.println("Ödeyeceğiniz ücret: " + 2*(ucret - (ucret * 0.3 + (ucret*0.7) * 0.2)));


                } else {
                    System.out.println("Gidiş dönüş indirimi: " + ucret * 0.2);
                    System.out.println("Ödeyeceğiniz Ücret: " + 2*(ucret * 0.8));
                }
            }

            System.out.println("Ödeyeceğiniz ücret: " + mesafe * mesafeBirim);

            }else{
            System.out.println("Hatalı veri girdiniz!");
        }
    }
}
