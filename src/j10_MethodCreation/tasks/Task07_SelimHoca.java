package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task07_SelimHoca {

    public static void main(String[] args) {
        //Task-> Girilen 3  sayıdan en küçüğünü print eden METHOD  create ediniz
        Scanner scan=new Scanner(System.in);
        System.out.println("1.sayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("2.sayiyi giriniz");
        int sayi2= scan.nextInt();
        System.out.println("3.sayiyi giriniz");
        int sayi3= scan.nextInt();
        System.out.println(minSayi(sayi1, sayi2, sayi3));

    }//main sonu

    private static int minSayi(int sayi1, int sayi2, int sayi3) {
        //System.out.println(Math.min(Math.min(sayi1,sayi2),sayi3));
        return sayi1<sayi2?Math.min(sayi1,sayi3):Math.min(sayi2,sayi3);
    }


}//Class sonu
