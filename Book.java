public class Book {

	// Attributes
	private String name;
	private String description;
	private double price;
	private Author author;

	// Getters and Setters
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}

	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription(){
		return this.description;
	}

	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return this.price;
	}

	public void setAuthor(Author author){
		this.author = author;
	}
	public Author getAuthor(){
		return this.author;
	}

	public void showDetail() {

		System.out.println("Book details");
		System.out.println("Name: " + name);
		System.out.println("Description: " + description);
		System.out.println("Price: " + price);

		if (this.hasAuthor()){
			author.showDetail();
		}
		System.out.println("-------------");
	}

	public boolean applydiscount(double discount) {
		if (discount < 0.3){
			this.price -= this.price * discount;
			return true;
		}
		else return false;
	}

	public boolean hasAuthor() {
		return this.author != null;
	}
}