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

	public boolean applydiscount(double discount) {
		if (discount < 0.3){
			this.price -= this.price * discount;
			return true;
		}
		else return false;
	}

	boolean hasAuthor() {
		return this.author != null;
	}
}