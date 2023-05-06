// Rectangle Class File
public class Rectangle {

	// Variable of data type double
	double length;
	double width;

	// Area Method to calculate the area of Rectangle
	void Area()
	{
		double area;
		area = this.length * this.width;
		System.out.println("Area of rectangle is : "+ area);
	}

	// Perimeter Method to calculate the Perimeter of
	// Rectangle
	void Perimeter()
	{
		double perimeter;
		perimeter = 2 * (this.length + this.width);
		System.out.println("Perimeter of rectangle is : "+ perimeter);
	}
}