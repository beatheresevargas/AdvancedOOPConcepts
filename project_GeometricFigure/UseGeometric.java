package project_GeometricFigure;

public class UseGeometric {


	public static void main (String[] args)
	{
		double area;
		int figureHeight, figureWidth;
		String figureType;
		
		GeometricFigure[] figure = new GeometricFigure[2];
		Square fig0 = new Square (3,3, "Square");
		Triangle fig1 = new Triangle (7,13, "Triangle");

		
		figure [0] = fig0;
		figure [1] = fig1;

		
		for (int i = 0; i<figure.length; i++)
		{
			figureHeight = figure[i].getHeight();
			figureWidth = figure[i].getWidth();
			figureType = figure[i].getType();
			
			area = figure[i].figureArea(figureHeight, figureWidth);
			
			System.out.println("figure: " + figureType +
					"\nheight: " + figureHeight +
					"\nwidth: " + figureWidth 
					+ "\narea: " + area + "\n");
		}
	}
}
