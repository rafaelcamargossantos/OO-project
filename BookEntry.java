public class BookEntry {
	public static void main(String[] args){

		Author author1 = new Author();
		author1.setName("Rafael Santos");
		author1.setEmail("rafaelcamargossantos@gmail.com");

		Book book1 = new Book();
		book1.setName("Livro 1");
		book1.setDescription("Primeiro livro");
		book1.setPrice(59.99);
		book1.setAuthor(author1);

		book1.showDetail();
	}
}