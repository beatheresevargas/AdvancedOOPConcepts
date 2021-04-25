package project_Insurance;

public class Life extends Insurance{

	public Life(String type) {
		super(type);
		setCost();
	}

	public void setCost()
	{
		this.monthlyCost = 36;
	}

	@Override
	public void display() {
		System.out.println("\nType of Insurance: " + getType()
		+ "\nmonthly cost: $" + getCost());
		
	}
}
