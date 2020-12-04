public class Square implements GeometricFigure{
    private double side;
	Square(double side){
		this.side = side;
	}
	
	
	@Override
	public double getArea() {
		return side*side;
		
	}
	
	@Override
	public double getPerimeter() {
		return side*4;	
	}
	
	@Override
	public void print(){
	System.out.print("Area = "+ getArea()+" Perimeter = "+getPerimeter());
	System.out.println("\n");
	}
}