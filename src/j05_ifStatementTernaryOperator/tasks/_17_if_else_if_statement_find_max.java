package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class _17_if_else_if_statement_find_max {

    public static void main(String[] args) {

      /* Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         Bu en yüksek numarayı yazdırın.

         Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır  */

        Scanner scan = new Scanner(System.in);
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        int i3 = scan.nextInt();
        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        /*int eb = i1;
        if (i2>eb) {
            eb = i2;
        }
        if ( i3>eb){
            eb = i3;
        }
        System.out.println("en büyük sayi = " + eb);
        */
         if (i1 > i2 && i1>i3 ){
             System.out.println("en büyük sayı = " + i1);
         }
         else if (i2 > i1 && i2>i3 ){
             System.out.println("en büyük sayı = " + i2);
         }else System.out.println("en büyük sayı = " + i3);



    }
}
