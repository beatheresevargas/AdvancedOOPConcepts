package project_Book;

public class UseBook {

	public static void main (String[] args)
	{
		Fiction Book1 = new Fiction ("The Lost Hero");
		NonFiction Book2 = new NonFiction("Astronomy 101");
		
		System.out.println("FICTION" + "\ntitle: " + Book1.getTitle() + "\nprice: $" + Book1.getPrice() + "\n");
		System.out.println("NONFICTION" + "\ntitle: " + Book2.getTitle() + "\nprice: $" + Book2.getPrice() + "\n");
	}
}
