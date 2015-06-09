public class Book {

	String name;
	String description;
	double price;
	Author author;
	
	void showDetail() {

		System.out.println("Book details");
		System.out.println("Name: " + name);
		System.out.println("Description: " + description);
		System.out.println("Price: " + price);

		if (this.hasAuthor()){
			author.showDetail();
		}
		System.out.println("-------------");
	}

	public void applydescount(double descount) {
		this.price -= this.price * descount;
	}

	boolean hasAuthor() {
		return this.author != null;
	}
}