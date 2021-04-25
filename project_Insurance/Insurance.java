package project_Insurance;

public abstract class Insurance {

	private String insuranceType;
	protected int monthlyCost;
	
	
	public Insurance (String type)
	{
		this.insuranceType=type;
	}
	
	public abstract void setCost();
	public abstract void display();
	
	public String getType()
	{
		return insuranceType;
	}
	
	public int getCost()
	{
		return monthlyCost;
	}
	
}
