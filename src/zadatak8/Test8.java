package zadatak8;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite broj: ");
		int broj = unos.nextInt();

		hailstoneSekvenca(broj);

	}

	public static void hailstoneSekvenca(int broj) {

		while (broj > 1) {

			if (broj % 2 == 0) {
				broj = broj / 2;
				System.out.print(broj + " ");
			} else if (broj % 2 != 0) {
				broj = (3 * broj) + 1;
				System.out.print(broj + " ");
			}
		}

	}

}
