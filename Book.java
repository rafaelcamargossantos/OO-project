public abstract class Book {

	// Attributes
	private String name;
	private String description;
	private double price;
	private String isbn;
	private Author author;

	// Constructors
	public Book(Author author){
		this.author = author;
		this.isbn = "000-00-00000-00-0";
	}

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

	public void setIsnb(String isbn){
		this.isbn = isbn;
	}
	public String getIsbn(){
		return this.isbn;
	}

	public Author getAuthor(){
		return this.author;
	}

	public void showDetail() {

		System.out.println("Book details");
		System.out.println("Name: " + name);
		System.out.println("Description: " + description);
		System.out.println("Price: " + price);
		System.out.println("ISBN: " + isbn);
		author.showDetail();
		System.out.println("-------------");
	}

	public abstract boolean applyDiscount(double discount);
}