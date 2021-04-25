package project_Book;

public class Fiction extends Book {
		
	public Fiction (String title)
	{
			super(title);
			setPrice();
	}
	
	public void setPrice()
	{
		this.bookPrice = 24.99;
	}
}
