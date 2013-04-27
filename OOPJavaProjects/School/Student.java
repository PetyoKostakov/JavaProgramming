package School;

public class Student
{
	private final String name;
	private final int studentNumber;
	private static int studentCounter = 1;

	public Student(String name)
	{
		this.name = name;
		this.studentNumber = studentCounter;
		increeseStudentCounter();
	}

	public String getName()
	{
		return name;
	}

	public int getStudentNumber()
	{
		return studentNumber;
	}

	public static int getStudentCounter()
	{
		return studentCounter;
	}

	private static void increeseStudentCounter()
	{
		studentCounter++;
	}

	@Override
	public String toString()
	{
		return "Student: " + this.name + "\nStudent number: "
				+ this.studentNumber;
	}
}
