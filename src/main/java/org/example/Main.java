package org.example;
/*
program 100 ile 555 arasındaki palindromik sayıları bulur ve listeler. Bir palindromik sayı, tersten okunduğunda aynı olan bir sayıdır.
Örneğin, 121, 555 gibi. Program, her bir sayıyı ters çevirerek orijinal sayıyla karşılaştırır ve palindromik olanları ekrana yazdırır.
Bu şekilde, belirtilen aralıktaki tüm palindromik sayıları bulabiliriz.
*/

public class Main {
    public static void main(String[] args) {

        System.out.println("Palindrom sayılar (100-9999 arası):");
        for (int i = 100; i <= 555; i++) {
            if (isPalindrom(i)) {
                System.out.print(i + ",");
            }
        }
    }

    // Bir sayının palindromik olup olmadığını kontrol eden metod
    public static boolean isPalindrom(int n) {
        int tersi = 0;
        int temp = n;

        while (temp != 0) {
            int basamak = temp % 10;
            tersi = tersi * 10 + basamak;
            temp /= 10;
        }

        return n == tersi;
    }
}