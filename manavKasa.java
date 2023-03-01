/* 
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
*/

package Java.ilKonu.egzersizler;

import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args){
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Kaç kilo armut aldığınızı giriniz: ");
        armut = scan.nextDouble();
        
        System.out.print("Kaç kilo elma aldığınızı giriniz: ");
        elma = scan.nextDouble();

        System.out.print("Kaç kilo domates aldığınızı giriniz: ");
        domates = scan.nextDouble();

        System.out.print("Kaç kilo muz aldığınızı giriniz: ");
        muz = scan.nextDouble();

        System.out.print("Kaç kilo patlıcan aldığınızı giriniz: ");
        patlican = scan.nextDouble();

        double toplam = armut + elma + domates + muz + patlican;

        System.out.print("Toplam ödemeniz gereken tutar: " + toplam + " TL'dir.");

    }
    
}
