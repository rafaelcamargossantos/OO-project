public class Ebook extends Book {

	// Attributes
	private String waterMark;

	// Constructors
	public Ebook(Author author){
		super(author);
	}

	// Getters and Setters
	public void setWaterMark(String waterMark){
		this.waterMark = waterMark;
	}
	public String getWaterMark(){
		return this.waterMark;
	}

	// Other Methods
	@Override
	public boolean applydiscount(double discount) {
		if (discount <= 0.15){
			super.setPrice(super.getPrice() - super.getPrice()*discount);
			System.out.println("discont applied to ebook")
			return true;
		}
		else return false;
	}
}