package project_Book;

public abstract class Book {

	String bookTitle;
	double bookPrice;
	
	public Book(String title)
	{
		this.bookTitle = title;
	}
	
	public String getTitle()
	{
		return bookTitle;
	}
	
	public double getPrice()
	{
		return bookPrice;
	}
	
	public void setPrice(double price)
	{
		this.bookPrice = price;
	}
}
