package zadatak1;

public class Author {

	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "\n" + 
				"-------------------------------------------------\n"
				+ name + "\nEmail: " + email + "\nGender: " + gender + 
				"\n-------------------------------------------------\n";
	}
	
	

}
