// https://app.patika.dev/
// https://app.patika.dev/thendbranch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Ödev
            Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz : ");
        int x = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");

        int y = input.nextInt();
        int a = 1;
        int ebob =0;
        int ekok ;
        while (a<=x || a<=y){
            a++;

            if (x%a == 0 && y%a == 0){
                ebob=a;
                System.out.println(x + " ve " + y + "'nin "+"Ebobu : " + ebob);
                ekok = (x*y)/ebob;
                /*System.out.println(x + " ve " + y + "'nin "+"Ekoku : " + ekok);*/
            }
        }
        ekok = (x*y)/ebob;
        System.out.println(x + " ve " + y + "'nin "+"Ekoku : " + ekok);
    }
}