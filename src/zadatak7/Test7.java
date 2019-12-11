package zadatak7;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite recenicu: ");
		String str = unos.nextLine();
		
		System.out.println(roliercoaster(str));
		

	}
	
	public static String roliercoaster(String str) {
		
		char[] nizstr = str.toCharArray();
		
		for(int i = 0; i < nizstr.length; i+=2) {
			nizstr[i] = Character.toUpperCase(nizstr[i]);
		}
				
		return String.valueOf(nizstr);
	}

}
