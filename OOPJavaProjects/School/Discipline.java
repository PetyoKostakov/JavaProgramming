package School;

public class Discipline
{
	private final String name;
	private final int numberLessons;
	private final int number≈xercises;

	public Discipline(String name, int numberLessons, int numberExercises)
	{
		this.name = name;
		this.numberLessons = numberLessons;
		this.number≈xercises = numberExercises;
	}

	public String getName()
	{
		return name;
	}

	public int getNumberLessons()
	{
		return numberLessons;
	}

	public int getNumber≈xercises()
	{
		return number≈xercises;
	}

	@Override
	public String toString()
	{
		return "Discipline name: " + name + "\nNumber of lessons: "
				+ this.numberLessons + "\nNumber of exercises: "
				+ number≈xercises;
	}
}
