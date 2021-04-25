package project_GeometricFigure;

public abstract class GeometricFigure {

	public int figureHeight, figureWidth;
	public String figureType;
	
	public GeometricFigure (int height, int width, String type)
	{
		this.figureHeight=height;
		this.figureWidth=width;
		this.figureType=type;
	}
	
	public int getHeight()
	{
		return figureHeight;
	}
	
	public int getWidth()
	{
		return figureWidth;
	}
	
	public String getType()
	{
		return figureType;
	}
	
	public abstract double figureArea(int figureHeight, int figureWidth);
	
}
