package zadatak4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite recenicu: ");
		String str = unos.nextLine();
		
		String[] niz = str.split(" ");
		
		System.out.println("Zadnja rijec je : " + niz[niz.length-1]);
	}
}
