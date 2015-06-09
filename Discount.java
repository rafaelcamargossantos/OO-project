public class Discount {
	public static void main(String[] args) {

		Author author1 = new Author();
		author1.setName("Rafael Santos");
		author1.setEmail("rafaelcamargossantos@gmail.com");

		Book book = new Book(author1);
		book.setPrice(59.99);

		System.out.println("Preço atual: " + book.getPrice());

		if (book.applydiscount(0.2)){
			System.out.println("Preço com desconto: " + book.getPrice());
		}
		else System.out.println("Desconto não pode ser maior que 30%");
	}
}