package com.trlogic;

import java.util.Scanner;

//Programda diziler kullan�c�dan al�nan say�larla olu�turulmu�tur.
//Olu�turulan diziler s�ralanm��t�r.
//Olu�turulan ve s�ralanan diziler birle�tirilmi�tir.
public class Dizi {
	public int dizi[] = new int[10];

	private void diziDoldur(Scanner scanner) {
		for (int i = 0; i < 10; i++) {
			System.out.print("Dizinin " + i + ". eleman� : ");
			this.dizi[i] = scanner.nextInt();
		}
	}

	private void diziSirala(Dizi dizi) {
		int boyut = dizi.getDizi().length;
		for (int i = 0; i < boyut; i++) {
			for (int j = 0; j < (boyut - 1); j++) {
				if (dizi.dizi[j + 1] < dizi.dizi[j]) {
					int takas = dizi.dizi[j];
					dizi.dizi[j] = dizi.dizi[j + 1];
					dizi.dizi[j + 1] = takas;
				}
			}
		}

		for (int i = 0; i < boyut; i++) {
			System.out.print(dizi.dizi[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Dizi dizi1 = new Dizi();
		dizi1.diziDoldur(scanner);
		System.out.println("1.dizi dolduruldu...");
		dizi1.diziSirala(dizi1);
		System.out.println();
		System.out.println("1. dizi s�raland�.");

		Dizi dizi2 = new Dizi();
		dizi2.diziDoldur(scanner);
		System.out.println("2.dizi dolduruldu...");
		dizi2.diziSirala(dizi2);
		System.out.println();
		System.out.println("2. dizi s�raland�.");

		ikiDiziBirlestir(dizi1, dizi2);
	}

	private static void ikiDiziBirlestir(Dizi dizi1, Dizi dizi2) {
		int boyut1 = dizi1.getDizi().length; 
		int boyut2 = dizi2.getDizi().length;
		int boyut = boyut1 + boyut2;
		int dizi[] = new int[boyut];
		int j = 0, k = 0;
		for (int i = 0; i < boyut; i++) {
			if (j < boyut1) {
				if(dizi1.dizi[j] <= dizi2.dizi[k])
					dizi[i] = dizi1.dizi[j++];
				else 
					dizi[i] = dizi2.dizi[k++];
			}else if(k < boyut2){
				dizi[i] = dizi2.dizi[k++];
			}
		}
		System.out.println("�ki dizi birle�tirildi.");
		for (int i = 0; i < boyut; i++) {
			System.out.print(dizi[i] + " ");
		}
	}

	public void setDizi(int[] dizi) {
		this.dizi = dizi;
	}

	public int[] getDizi() {
		return dizi;
	}
}
