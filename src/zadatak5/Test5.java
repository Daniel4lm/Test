package zadatak5;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite rijeci: ");
		String str = ""; // unos.nextLine();

		ArrayList<String> lista = new ArrayList<>();

		while (unos.hasNext()) {

			System.out.print("Unesite rijec: ");
			str = unos.next();
			if (str.equals("kraj")) {
				break;
			} else {
				lista.add(str);
			}
		}

		for (String s : lista) {
			System.out.print(s +" ");
		}

		unos.close();
	}

}
