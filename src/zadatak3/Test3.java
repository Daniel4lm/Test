package zadatak3;

public class Test3 {

	public static void main(String[] args) {

		MyArray red = new MyArray(new int[] { 2, 3, 56, 14, 7, 9, 87 });

		System.out.println("Najveci element : " + red.getLargestElement());
		System.out.println("Najmanji elemnet je: " + red.getSmallestElement());
		System.out.println("Suma je " + red.sumAllElements());
		red.printAllElements();

	}

}
