public class Discount {
	public static void main(String[] args) {
		Book book = new Book();
		book.price = 59.99;

		System.out.println("Preço atual: " + book.price);

		if (book.applydiscount(0.4)){
			System.out.println("Preço com desconto: " + book.price);
		}
		else System.out.println("Desconto não pode ser maior que 30%");
	}
}