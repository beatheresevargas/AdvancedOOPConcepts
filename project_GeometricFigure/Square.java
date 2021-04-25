package project_GeometricFigure;

public class Square extends GeometricFigure {

	private double area;
	
	public Square (int height, int width, String type)
	{
	super(height, width, type);
	}

	@Override
	public double figureArea (int height, int width)
	{
		area = (double)(height*width);
		return area;
	}

}

