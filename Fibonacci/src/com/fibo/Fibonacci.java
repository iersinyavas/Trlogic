package com.fibo;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();

		System.out.print("�stenen fibonacci say� miktar� : ");
		Scanner scanner = new Scanner(System.in);

		// Fibonacci serisindeki en k���k say� olan 0 de�erleri verilir ve �retilmek
		// istenen say� miktar� girilir.
		fibonacci.fibonacci(0, 0, scanner.nextInt());
	}

	private int fibonacci(int oncekiSayi, int simdikiSayi, int sayiAdedi) {
		
		if (sayiAdedi == 0)   // �retilecek say� adedi eksilerek gelir ve 0 oldu�unda metottan ��k�l�r
			return 0;
		System.out.print(oncekiSayi + " ");
		if (oncekiSayi == 0)    // Fibonacci serisi 0 dan ba�lar. �kinci say� i�in 1 artt�r�l�r.
			oncekiSayi++;

		int sonrakiSayi = simdikiSayi + oncekiSayi;   // Bir �nceki say�yla �imdiki say� toplanarak sonraki turdaki say� belirlenir.		
		if (simdikiSayi == 0)
			simdikiSayi++;
		return fibonacci(simdikiSayi, sonrakiSayi, --sayiAdedi);
	}
}
