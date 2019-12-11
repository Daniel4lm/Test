package zadatak2;

public class Test2 {

	public static void main(String[] args) {
		Racunar racunar = new Racunar(4, 500, 3.8, 17, 556);
		Laptop laptop = new Laptop(3, 250, 2.5, 15, 760, 12);
		
		System.out.println(racunar.toString());
		System.out.println(laptop.toString());
	}

}
