import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Okul puanlarının harf karşılığını yazan program.
 * Random alınabilir değerler.
 */

class main {
    public static void main(String[] args) {

        int vize, final_notu;
        double sonuc;
        int number = (int) (Math.random() * 100);
        System.out.println(number);

        // sonuç yanlış vermemesi için >= ifadesini kullanacağız

        if (number >= 0 && number < 35) {
            System.out.println("Your Score FF");

        } else if (number >= 35 && number < 50) {

            System.out.println("Your Score DC");
        } else if (number >= 50 && number < 70) {

            System.out.println("Your Score BB");
        } else {
            System.out.println("Your Score AA");
        }
    }

}