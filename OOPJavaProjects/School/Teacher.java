package School;

import java.util.ArrayList;

public class Teacher
{
	private final String name;
	ArrayList<Discipline> disciplines = new ArrayList<Discipline>();

	public Teacher(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public ArrayList<Discipline> getDisciplines()
	{
		return disciplines;
	}

	public void addDiscipline(Discipline newDiscipline)
	{
		disciplines.add(newDiscipline);
	}

	@Override
	public String toString()
	{
		return "Teacher name: " + name;
	}
}
