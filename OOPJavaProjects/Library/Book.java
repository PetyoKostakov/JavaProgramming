package Library;

public class Book
{
	private final String title;
	private final String autor;
	private String publisher;
	private int yearOfPublishing;
	private final int serialNumber;
	private static int serialNumberCounter = 1;

	public Book(String title, String autor)
	{
		this.title = title;
		this.autor = autor;
		this.serialNumber = Book.getSerialNumberCounter();
		raiseSerial();
	}

	public String getTitle()
	{
		return title;
	}

	public String getAutor()
	{
		return autor;
	}

	public String getPublisher()
	{
		return publisher;
	}

	public int getYearOfPublishing()
	{
		return yearOfPublishing;
	}

	public int getSerialNumber()
	{
		return serialNumber;
	}

	public static int getSerialNumberCounter()
	{
		return serialNumberCounter;
	}

	public static void raiseSerial()
	{
		serialNumberCounter++;
	}

	@Override
	public String toString()
	{
		return "Title: " + this.title + "\nAutor: " + this.autor
				+ "\nSerial number: " + this.serialNumber;
	}

}
