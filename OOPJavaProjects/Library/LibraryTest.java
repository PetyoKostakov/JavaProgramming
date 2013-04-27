package Library;

public class LibraryTest
{
	public static void main(String[] args)
	{
		// Book book1 = new Book("Core Java", "Nqkoi Si");
		// Book book2 = new Book("Introduction to Programing", "Nakov");
		// Book book3 = new Book("test", "Kostakov");
		// Book book4 = new Book("Spring", "Gocev");
		// Book book5 = new Book("Applets", "Kostov");
		Library.addBook(new Book("Core Java", "Nqkoi Si"));
		Library.addBook(new Book("Introduction to Programing", "Nakov"));
		Library.addBook(new Book("test", "Kostakov"));
		Library.addBook(new Book("Core Java", "Nqkoi Si"));
		Library.addBook(new Book("Spring", "Gocev"));
		Library.addBook(new Book("Applets", "Kostov"));
		// System.out.println(book1.getSerialNumber());
		// System.out.println(book2.getSerialNumber());
		// System.out.println(book3.getSerialNumber());
		// System.out.println(book4.getSerialNumber());
		// System.out.println(book5.getSerialNumber());

		Library.findBook("Nakov");
		System.out.println("-------------------");
		Library.deleteBook("Core Java");
	}
}
