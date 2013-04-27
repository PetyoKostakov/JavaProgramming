package Telephone;

public class Battery
{
	private final String model;
	private final int idleTime;
	private final int hoursTalk;

	public Battery()
	{
		this.model = null;
		this.idleTime = 0;
		this.hoursTalk = 0;
	}

	public Battery(String model, int idleTime, int hoursTalk)
	{
		this.model = model;
		this.idleTime = idleTime;
		this.hoursTalk = hoursTalk;
	}

	public String getModel()
	{
		return model;
	}

	public int getIdleTime()
	{
		return idleTime;
	}

	public int getHoursTalk()
	{
		return hoursTalk;
	}
}
