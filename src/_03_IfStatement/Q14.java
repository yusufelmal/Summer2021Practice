package _03_IfStatement;

import java.util.Scanner;

public class Q14 {
    /*
    A şehrinden uçamk isteyen bir kişi B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    km birim fiyati : 0.10$ 12 yasindan kucukse toplam fiyat %50 indirim 12 ve 24
    yas arasindaysa 10% 65 yasindan buyukse 30% gidis donus alirsa20% bu
    kosullara gore yolcudan gideceği mesafeyi isteyip ucak biletini hesaplayan program
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen yaşınızı giriniz : ");
        int yas = scan.nextInt();

       Scanner sc = new Scanner(System.in);

        System.out.println("biletiniz çift yön mü olacak ? : ");
        String ciftYon = sc.nextLine();

        double kmFiat = 0.10;

        if (ciftYon.equalsIgnoreCase("evet")) {
            double ciftYonFiyat = kmFiat * 4 / 5;//gidiş dönüş için %20 indirim=4/5 orana denk gelir..
            if (yas>=0 && yas < 12) {
                System.out.println("bilet ücretiniz : $" + (ciftYonFiyat / 2) );
            } else if (yas >= 12 && yas <= 24) {
                System.out.println("bilet ücretiniz : $" + (ciftYonFiyat * 9 / 10));
            } else if (yas > 24 && yas <= 65) {
                System.out.println("bilet ücretiniz : $" + ciftYonFiyat);
            } else if (yas > 65) {
                System.out.println("bilet ücretiniz : $" + (ciftYonFiyat * 7 / 10));
            }else System.out.println(" yaşınızı hatalı  girdiniz");
        }

        else if (ciftYon.equalsIgnoreCase("hayır")) {

            if (yas>=0 && yas < 12) {
                System.out.println("bilet ücretiniz : $" + (kmFiat / 2));
            } else if (yas >= 12 && yas <= 24) {
                System.out.println("bilet ücretiniz : $" + (kmFiat * 9 / 10));
            } else if (yas > 24 && yas <= 65) {
                System.out.println("bilet ücretiniz : $" + kmFiat);
            } else if (yas > 65) {
                System.out.println("bilet ücretiniz : $" + (kmFiat * 7 / 10));
            }else System.out.println(" yaşınızı hatalı  girdiniz");
        }else System.out.println(" ucuş için tek yon cift yon cevabınızı hatalı  girdiniz");
    }
}
