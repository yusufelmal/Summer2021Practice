package _04_TernaryOperator;

import java.util.Scanner;

public class Soru_01 {

    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

        Scanner scan = new Scanner(System.in);

        System.out.println("Sayi giriniz");
        int num = scan.nextInt();
        if (num>=0) {
            String result = (num > 99 && num < 1000) ? ("3 basamakli") : (num % 2 == 0 ? "3 basamaklı olmayan  çift sayı" : "3 basamaklı olmayan tek sayı");
            System.out.println(result);
        }
        else System.out.println("hatalı sayi girdiniz");

    }
}
