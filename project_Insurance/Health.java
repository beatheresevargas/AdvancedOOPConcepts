package project_Insurance;

public class Health extends Insurance{
	
	public Health (String type)
	{
		super(type);
		setCost();
	}

	public void setCost()
	{
		this.monthlyCost = 196;
	}

	@Override
	public void display() {
		System.out.println("\nType of Insurance: " + getType()
		+ "\nmonthly cost: $" + getCost());
		
	}
}

