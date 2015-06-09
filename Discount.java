public class Discount {
	public static void main(String[] args) {
		Book book = new Book();
		book.setPrice(59.99);

		System.out.println("Preço atual: " + book.getPrice());

		if (book.applydiscount(0.2)){
			System.out.println("Preço com desconto: " + book.getPrice());
		}
		else System.out.println("Desconto não pode ser maior que 30%");
	}
}