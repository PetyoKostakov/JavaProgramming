Telephone;

import java.util.ArrayList;
import java.util.Date;

public class TelephoneTest
{
	public static void main(String[] args)
	{
		ArrayList<Telephone> telephones = new ArrayList<Telephone>();
		telephones.add(new Telephone("SamsungS3", 2000, new Battery("Li-Ion",
				2000, 1000), new Display(4.7, 100000)));
		telephones.add(new Telephone("Sony", 3000, new Battery("Li-Ion", 2000,
				1000), new Display(4.7, 100000)));
		telephones.add(new Telephone("Iphone", 10000, new Battery("Li-Ion",
				2000, 1000), new Display(4.7, 100000)));
		for (Telephone telephone : telephones)
		{
			System.out.println(telephone.toString());
			System.out.println("______________");
		}
		Telephone.printNokiaN95();
		Telephone testCallTelephone = new Telephone("Cool", 1000);
		testCallTelephone.makeCall(new Call(new Date(), 5));
		testCallTelephone.makeCall(new Call(new Date(), 7));
		testCallTelephone.makeCall(new Call(new Date(), 60));
		testCallTelephone.makeCall(new Call(new Date(), 70));
		testCallTelephone.callHistory();
		testCallTelephone.calcCallsPrice(0.54);
		System.out.println("-------------------");
		testCallTelephone.deleteLongestCall();
		testCallTelephone.callHistory();
		testCallTelephone.calcCallsPrice(0.54);
		System.out.println("-------------------");
		testCallTelephone.deleteCall(2);
		testCallTelephone.callHistory();
		testCallTelephone.calcCallsPrice(0.54);
	}
}
