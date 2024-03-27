package classworkday1;

public class Square extends Quadrilateral{
	public Square(int side) {
        super(side, side);
    }
    
    @Override
    public double area() {
        return base * base;
    }
}
