package com.fibo;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();

		System.out.print("Ýstenen fibonacci sayý miktarý : ");
		Scanner scanner = new Scanner(System.in);

		// Fibonacci serisindeki en küçük sayý olan 0 deðerleri verilir ve üretilmek
		// istenen sayý miktarý girilir.
		fibonacci.fibonacci(0, 0, scanner.nextInt());
	}

	private int fibonacci(int oncekiSayi, int simdikiSayi, int sayiAdedi) {
		
		if (sayiAdedi == 0)   // Üretilecek sayý adedi eksilerek gelir ve 0 olduðunda metottan çýkýlýr
			return 0;
		System.out.print(oncekiSayi + " ");
		if (oncekiSayi == 0)    // Fibonacci serisi 0 dan baþlar. Ýkinci sayý için 1 arttýrýlýr.
			oncekiSayi++;

		int sonrakiSayi = simdikiSayi + oncekiSayi;   // Bir önceki sayýyla þimdiki sayý toplanarak sonraki turdaki sayý belirlenir.		
		if (simdikiSayi == 0)
			simdikiSayi++;
		return fibonacci(simdikiSayi, sonrakiSayi, --sayiAdedi);
	}
}
