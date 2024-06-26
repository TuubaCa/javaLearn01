package j11_Arrays;

import java.util.Arrays;

public class C06_Arrays_CopyOf {
    public static void main(String[] args) {
        // Arrays.copyOf(arr,int);-> girilen arr'yin istenen elelman sayısı kadar ilk elemanı kopyalar
        int[] arr={2,15,13,5,65,49,38,33,55,27};
        int[] yeniArr= Arrays.copyOf(arr,5);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));//[2, 15, 13, 5, 65, 49, 38, 33, 55, 27]
        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));//[2, 15, 13, 5, 65]

        // arr'in son 3 elamanını store(depolayan) arrayi print eden code create ediniz...
        //int[] yeniArr2=Arrays.copyOf(arr,arr.length-3);//arr arrayinin length'den 3 cikartip 7 elemanli bir yeni array create etti->[2, 15, 13, 5, 65, 49, 38]
        int[] yeniArr2=Arrays.copyOfRange(arr,arr.length-3,arr.length);
        System.out.println("Arrays.toString(yeniArr2) = " + Arrays.toString(yeniArr2));//[33, 55, 27]

        //Arrayi belirli bir ile set-update (fill(value)) etme
        System.out.println("arr fill(10) oncesi : "+Arrays.toString(arr));
        Arrays.fill(arr,10);
        System.out.println("arr fill(10) sonrasi : "+Arrays.toString(arr));

        // task-> arr 3 ile 7 index arası(3-4-5-6) elamanları 35 ile update eden code create ediniz...
        Arrays.fill(arr,3,7,35);//3.4.5.6. index elemanlar 35 ile update edildi
        System.out.println("arr fill 3-7 arasi 35 sonrasi : " + Arrays.toString(arr));
    }
}
