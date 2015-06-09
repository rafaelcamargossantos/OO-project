public class BookEntry {
	public static void main(String[] args){
		
		Book book1 = new Book();
		book1.name = "Livro 1";
		book1.description = "Primeiro livro";
		book1.price = 59.99;

		Author author1 = new Author();
		author1.name = "Rafael Santos";
		author1.email = "rafaelcamargossantos@gmail.com";

		book1.author = author1;

		book1.showDetail();

	}
}