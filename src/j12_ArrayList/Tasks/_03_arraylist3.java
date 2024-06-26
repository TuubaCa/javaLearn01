package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _03_arraylist3 {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {
        List<String> str = new ArrayList<>(Arrays.asList("New jersey", "New york", "Ohio", "Florida", "Boston"));
        System.out.println(str);
        System.out.println("getLength(str) = " + getLength(str));



    }

    private static ArrayList<Integer> getLength(List<String> arrList) {
        ArrayList<Integer> uzunluk = new ArrayList<>();
        //  String[] str = arrList.toArray(new String[0]);
        for (int i = 0; i < arrList.size(); i++) {
            uzunluk.add(arrList.get(i).replace(" ","").length());

        }
        return uzunluk;

      /*

        for (int i = 0; i < strList.size(); i++) {
            newInt.add(str[i].uzunluk());
        }
        return newInt;
*/
    }


}
