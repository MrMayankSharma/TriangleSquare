

import java.lang.Math;


public class Triangle implements GeometricFigure{
	private double sideOne, sideTwo, sideThree;
	public Triangle(double sideOne, double sideTwo, double sideThree){
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree= sideThree;
	}
	double halfp = (sideOne + sideTwo + sideThree)/2;
	@Override
	public double getArea(){
		return Math.sqrt(halfp*(halfp - sideOne)*(halfp - sideTwo)*(halfp - sideThree));
	}
	
	@Override
	public double getPerimeter(){
		return sideOne + sideTwo + sideThree;
	}
	
	@Override
	public void print(){
	System.out.print("Area = "+getArea()+" Perimeter = "+getPerimeter());
	System.out.println("\n");
	}
	
}

