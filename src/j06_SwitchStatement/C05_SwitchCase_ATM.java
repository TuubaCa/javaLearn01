package j06_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase_ATM {

    public static void main(String[] args) {
        /*
TaskATM-> Bakıye 1000$ olan bir banka hesabı için bakıye öğrenme-para çekme-para yatırma
 ve çıkış işlemlerinin yapıldığı bir ATM app. create ediniz.
 */
        Scanner scan = new Scanner(System.in);
        int bakiye = 1000;
        System.out.println("$$$ java banka hosgeldiniz");
        System.out.println("yapmak istediğiniz işemin numarasını giriniz: \n1->Bakiye sorgulama\n2->para cekme\n3->para yatırma\n4->cıkıs" );
        int secim = scan.nextInt();
        switch (secim){
            case 1:
                System.out.println("Hesabinda "+bakiye+"$ bakiyen var");
                break;
            case 2:
                System.out.println("Ne kadar para cekmek istiyorsun?");
                int cekilenMiktar=scan.nextInt();
                if (cekilenMiktar <= bakiye&&cekilenMiktar>0) {
                    bakiye-=cekilenMiktar;
                    System.out.println("Para cekme islemi basariyla gerceklesti.");
                }else {
                    System.out.println("Yetersiz bakiye");
                }
                break;
            case 3:
                System.out.println("Ne kadar para yatiracaksin?");
                int yatirilanMiktar=scan.nextInt();
                if (yatirilanMiktar>0){
                    bakiye+=yatirilanMiktar;
                    System.out.println("Para yatirma islemi basariyla gerceklesti" + bakiye );
                }else {
                    System.out.println("Htali giris");
                }
                break;
            case 4:
                System.out.println("Cikis yapiyorsunuz.Yine bekleriz");
                break;
            default:
                System.out.println("Hatali secim tekrar dene");
        }


    }
}