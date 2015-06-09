public class Author {

	// Attributes
	private String name;
	private String email;

	// Getters and Setters
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}

	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return this.email;
	}


	public void showDetail() {
		System.out.println("Author details");
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
	}
}