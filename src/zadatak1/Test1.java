package zadatak1;

public class Test1 {

	public static void main(String[] args) {
		
		Author autor = new Author("Dejan", "dejan@gmail.com", 'm');
		Book knjiga = new Book("Java programiranje", autor, 55.4, 4);
		
		System.out.println(knjiga.toString());

	}

}
