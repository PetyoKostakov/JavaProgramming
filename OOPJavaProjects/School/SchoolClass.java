package School;

import java.util.ArrayList;

public class SchoolClass
{
	private final String textIdentifire;
	ArrayList<Teacher> teachers = new ArrayList<Teacher>();

	public SchoolClass(String textIdentifire)
	{
		this.textIdentifire = textIdentifire;
	}

	public String getTextIdentifire()
	{
		return textIdentifire;
	}

	public void addTeacher(Teacher newTeacher)
	{
		teachers.add(newTeacher);
	}

	@Override
	public String toString()
	{
		return "School class name: " + textIdentifire;
	}
}
