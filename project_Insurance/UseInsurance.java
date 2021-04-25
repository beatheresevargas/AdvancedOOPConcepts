package project_Insurance;
import java.util.*;

public class UseInsurance {

	public static void main (String[] args)
	{
		try (Scanner sc = new Scanner (System.in)) {
			int insurance;
					
			System.out.println("What type of insurance are you looking for?"
					+ "\n1: Life Insurance \n2: Health Insurance \n");
			String user = sc.next();
			insurance = Integer.parseInt(user);
			
			if(insurance == 1)
			{
				lifeInsurance();
			}
			else
			{
				healthInsurance();
			}
		}
	}
		
	private static void lifeInsurance() {
		Life life = new Life("Life Insurance");
		life.display();
	}
	
	private static void healthInsurance() {
		Health health = new Health("Health Insurance");
		health.display();
	}

}
	

