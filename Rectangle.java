package classworkday1;

public class Rectangle extends Quadrilateral{
	public Rectangle(int length, int width) {
        super(length, width);
    }
    
    @Override
    public double area() {
        return base * height;
    }
}
