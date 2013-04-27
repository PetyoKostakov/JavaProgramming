package School;

public class SchoolTest
{
	public static void main(String[] args)
	{
		School TU = new School("TU - Sofia");
		TU.addClass(new SchoolClass("KST"));
		TU.addClass(new SchoolClass("EEEO"));
		TU.addStudent(new Student("Gosho"));
		TU.addStudent(new Student("Pesho"));
		System.out.println(TU);

		Teacher Kostaka = new Teacher("Kostaka");
		Kostaka.addDiscipline(new Discipline("PIK", 20, 10));
		Kostaka.addDiscipline(new Discipline("PE", 20, 10));

		// TO DO for all calsses
	}
}
