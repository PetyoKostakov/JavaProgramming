package Telephone;

public class Display
{
	private final double size;
	private final int colors;

	public Display()
	{
		this.size = 0;
		this.colors = 0;
	}

	public Display(double size, int colors)
	{
		super();
		this.size = size;
		this.colors = colors;
	}

	public double getSize()
	{
		return size;
	}

	public int getColors()
	{
		return colors;
	}
}
