package project_GeometricFigure;

public class Triangle extends GeometricFigure {
	
	private double area;
	
	public Triangle(int height, int width, String type)
	{
		super (height, width, type);
	}
	
	@Override
	public double figureArea(int figureHeight, int figureWidth) {
		area = (double) (figureHeight*figureWidth)/2;
		return area;
	}

}
