package j05_ifStatementTernaryOperator;
import java.util.Scanner;
public class C06_NestedTernaryOperator {
    public static void main(String[] args) {
        /*
        TASK :
        Girilen bir pozitif tamsayı  4 basamaklı ise  "4 Basamaklı"
        degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı"
        degilse "4 basamaklı olmayan tek sayı"  print eden code create ediniz.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir pozitif tam sayi giriniz: ");
        int sayi = sc.nextInt();
        System.out.println(sayi>999 && sayi<10000 ? "4 basamaklı": (sayi%2==0 ? "4 basamaklı olmayan çift sayı": "4 basamaklı olmayan tek sayı"));

    }
}
