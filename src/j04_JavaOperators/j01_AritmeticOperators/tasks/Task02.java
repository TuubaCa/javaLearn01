package j04_JavaOperators.j01_AritmeticOperators.tasks;

public class Task02 {
	/*
		 Write a program that prints multiplication table for 1.
		 Do not use any loop.
		    1x1=1
		    1x2=2
			1x3=3
			1x4=4
			1x5=5
			1x6=6
			1x7=7
			1x8=8
			1x9=9
			1x10=10
		 */
	public static void main(String[] args) {


		int n1 = 1;// birler burası
		int n2 = 1;//değişen

		System.out.println(n1 + "x" +n2 + "=" + (n1 * n2++)); // (++) önde olursa önce arttırıyor sonra yazdırıyor. // (++)ardında olursa once yazdırıyor sonra arttırıyor.
		System.out.println(n1 + "x" +n2 + "=" + (n1 * n2++));
		System.out.println(n1 + "x" +n2 + "=" + (n1 * n2++));
		System.out.println(n1 + "x" +n2 + "=" + (n1 * n2++));
		System.out.println(n1 + "x" +n2 + "=" + (n1 * n2++));
		System.out.println(n1 + "x" +n2 + "=" + (n1 * n2++));
		System.out.println(n1 + "x" +n2 + "=" + (n1 * n2++));
		System.out.println(n1 + "x" +n2 + "=" + (n1 * n2++));
		System.out.println(n1 + "x" +n2 + "=" + (n1 * n2++));
		System.out.println(n1 + "x" +n2 + "=" + (n1 * n2++));
		System.out.println(n1 + "x" +n2 + "=" + (n1 * n2++));




	}
}
