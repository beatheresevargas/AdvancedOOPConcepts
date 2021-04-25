package project_Book;

public class NonFiction extends Book {

	public NonFiction (String title)
	{
			super(title);
			setPrice();
	}
	
	public void setPrice()
	{
			this.bookPrice = 37.99;
	}
}
