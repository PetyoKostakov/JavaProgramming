package Telephone;

import java.util.Date;

public class Call
{
	private Date callDate = new Date();
	private final double callDuration;

	public Call(Date callDate, double callDuration)
	{
		this.callDate = callDate;
		this.callDuration = callDuration;
	}

	public double getCallDuration()
	{
		return callDuration;
	}

	public Date getCallDate()
	{
		return callDate;
	}

	@Override
	public String toString()
	{
		return "The call was made at: " + callDate + "\nThe duration was: "
				+ callDuration;
	}
}
