public class Magazine implements Product {

	// Attributes
	private String name;
	private String description;
	private double price;
	private Publisher publisher;

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
	public Publisher getPublisher(){
		return this.publisher;
	}

	// Other Methods
	public boolean applyDiscount(double discount) {
		if (discount <= 0.1){
			this.price -= this.price * discount;
			System.out.println("discont applied to printed book");
			return true;
		}
		else return false;
	}


}