package School;

import java.util.ArrayList;

public class School
{
	private final String name;
	ArrayList<SchoolClass> schoolClasses = new ArrayList<SchoolClass>();
	ArrayList<Student> students = new ArrayList<Student>();

	public School(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void addClass(SchoolClass newClass)
	{
		schoolClasses.add(newClass);
	}

	public void addStudent(Student newStudent)
	{
		students.add(newStudent);
	}

	@Override
	public String toString()
	{
		StringBuilder allStudents = new StringBuilder();
		for (Student student : students)
		{
			allStudents.append(student + "\n");
		}
		StringBuilder allClasseStringBuilder = new StringBuilder();
		for (SchoolClass classs : schoolClasses)
		{
			allClasseStringBuilder.append(classs.toString() + "\n");
		}
		return "School name: " + name + "\nClasses:\n" + allClasseStringBuilder
				+ "\nStudents:\n" + allStudents;
	}
}
