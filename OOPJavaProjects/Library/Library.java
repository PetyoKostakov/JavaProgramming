package Library;

import java.util.ArrayList;

public class Library
{
	private final String name;
	private static final ArrayList<Book> books = new ArrayList<Book>();

	public Library(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public ArrayList<Book> getBooks()
	{
		return books;
	}

	public static void addBook(Book book)
	{
		books.add(book);
	}

	public static void findBook(String autor)
	{
		int indexCounter = 0;
		int searchingBookIndex = 0;
		for (Book book : books)
		{
			if (book.getAutor().equalsIgnoreCase(autor))
			{
				searchingBookIndex = indexCounter;
			}
			indexCounter++;
		}
		System.out.println("The serching book is: ");
		System.out.println(books.get(searchingBookIndex));
	}

	public static void deleteBook(String title)
	{
		int indexCounter = 0;
		int searchingBookIndex = 0;
		for (Book book : books)
		{
			if (book.getTitle().equalsIgnoreCase(title))
			{
				searchingBookIndex = indexCounter;
			}
			indexCounter++;
		}
		System.out.println("You deleted the book: "
				+ books.get(searchingBookIndex));
		books.remove(searchingBookIndex);
	}
}
