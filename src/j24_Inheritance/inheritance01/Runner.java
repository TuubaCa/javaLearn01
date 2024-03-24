package j24_Inheritance.inheritance01;

public class Runner {           /*
 1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
 2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
 3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
 4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları için kullanılır.
 5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
 6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
 7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
   denir.
 8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
 9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

*/

    public static void main(String[] args) {
        Hayvanlar h1 = new Hayvanlar();//grand parent classtan obj create edildi
        h1.beslenme();
        h1.hareket();
        h1.icme();

        Balik b1=new Balik();//child classtan obje cerate edildi
        b1.izgaraTava();//child class kendi methodunu call etti
        b1.hareket();//parent classtan method call edildi.
        b1.icme();//parent classtan method call edildi.
        b1.beslenme();//parent classtan method call edildi.

        Memeliler m1=new Memeliler();//parent classtan obj create edildi
        m1.sutBeslen();//parent classtan meth call edildi.
        m1.dogum();//parent classtan meth call edildi.
        m1.beslenme();//grand parent classtan meth call edildi.
        m1.hareket();//grand parent classtan meth call edildi.
        m1.icme();//grand parent classtan meth call edildi.

        Koyun k1=new Koyun();//child class'tan obj create edildi
        k1.meler();//child class kendi meth call edildi
        k1.sutBeslen();//parent class'tan meth call edildi
        k1.dogum();//parent class'tan meth call edildi
        k1.icme();//grand-parent class'tan meth call edildi
        k1.hareket();//grand-parent class'tan meth call edildi
        k1.beslenme();//grand-parent class'tan meth call edildi

        Kedi p1=new Kedi();//child class'tan obj create edildi
        p1.cirmalama();//child class kendi meth call edildi
        p1.sutBeslen();//parent class'tan meth call edildi
        p1.dogum();//parent class'tan meth call edildi
        p1.icme();//grand-parent class'tan meth call edildi
        p1.hareket();//grand-parent class'tan meth call edildi
        p1.beslenme();//grand-parent class'tan meth call edildi

    }
}
