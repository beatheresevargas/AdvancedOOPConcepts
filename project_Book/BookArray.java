package project_Book;

public class BookArray {

	public static void main (String[] args)
	{
		Book[] book = new Book[10];
		book[0] = new Fiction("The Lost Hero (Fiction)");
		book[1] = new NonFiction("Astronomy 101 (Nonfiction)");
		book[2] = new Fiction("The Son of Neptune (Fiction)");
		book[3] = new NonFiction("Space Exploration: Past, Present, Future (Nonfiction)");
		book[4] = new Fiction("The Mark of Athena (Fiction)");
		book[5] = new NonFiction("The Discovery of the Universe (Nonfiction)");
		book[6] = new Fiction("The House of Hades (Fiction)");
		book[7] = new NonFiction("A Brief History of Time (Nonfiction");
		book[8] = new Fiction("The Blood of Olympus (Fiction)");
		book[9] = new NonFiction("Hidden Figures (Nonfiction)");
		
		System.out.print("BOOK INFORMATIONS:\n\n");
		
		for (Book books : book)
		{
			System.out.println("Book title: " + books.getTitle() + "\nprice: $" + books.getPrice() + "\n");
		}
	}
}
