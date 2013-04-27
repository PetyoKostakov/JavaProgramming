package Telephone;

import java.util.ArrayList;

public class Telephone
{
	private final String model;
	private String manufaturer;
	private final double price;
	private String owner;
	private Battery battery = new Battery();
	private Display display = new Display();
	private static Telephone nokiaN95 = new Telephone("NokiaN95", 1100.5,
			new Battery("Li-Ion", 200, 200), new Display(17.5, 15000));
	private final ArrayList<Call> calls = new ArrayList<Call>();

	public Telephone(String model, double price)
	{
		this.model = model;
		this.price = price;
	}

	public Telephone(String model, double price, Battery battery,
			Display display)
	{
		this.model = model;
		this.price = price;
		this.battery = battery;
		this.display = display;
	}

	public String getModel()
	{
		return model;
	}

	public String getManufaturer()
	{
		return manufaturer;
	}

	public double getPrice()
	{
		return price;
	}

	public String getOwner()
	{
		return owner;
	}

	public Battery getBattery()
	{
		return battery;
	}

	public Display getDisplay()
	{
		return display;
	}

	@Override
	public String toString()
	{
		return "Model: " + this.model + "\nPrice: " + this.price
				+ "\nBattery: " + battery.getModel() + ", "
				+ battery.getHoursTalk() + "\nDisplay: " + display.getSize()
				+ ", " + display.getColors();
	}

	public static void printNokiaN95()
	{
		System.out.println("Model: " + nokiaN95.model + "\nPrice: "
				+ nokiaN95.price + "\nBattery: " + nokiaN95.battery.getModel()
				+ ", " + nokiaN95.battery.getHoursTalk() + "\nDisplay: "
				+ nokiaN95.display.getSize() + ", "
				+ nokiaN95.display.getColors());
	}

	public void makeCall(Call call)
	{
		calls.add(call);
	}

	public void callHistory()
	{
		if (calls.isEmpty())
		{
			System.out.println("There is no calls in history!");
		}
		else
		{
			for (Call call : calls)
			{
				System.out.println(call);
			}
		}

	}

	public void deleteCall(int callNumber)
	{
		calls.remove(callNumber);
	}

	public void clearHistory()
	{
		calls.clear();
	}

	public void calcCallsPrice(double callPrice)
	{
		double callPriceSum = 0;
		for (Call call : calls)
		{
			callPriceSum += call.getCallDuration() * callPrice;
		}
		System.out.println("The price of your calls is: " + callPriceSum
				+ "ыт.");
	}

	public void deleteLongestCall()
	{
		double longestCall = 0;
		int indexOfLongestCall = 0;
		int counterIndex = 0;
		for (Call call : calls)
		{
			if (call.getCallDuration() > longestCall)
			{
				longestCall = call.getCallDuration();
				indexOfLongestCall = counterIndex;
			}
			counterIndex++;
		}
		calls.remove(indexOfLongestCall);
	}
}
