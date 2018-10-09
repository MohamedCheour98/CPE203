public class Triangle implements Shape{

	public Point A,B,C;
	public Color color;
	
	Triangle(Point v1,Point v2, Point v3, Color c){
	this.A = v1;
	this.B = v2;
	this.C = v3;
	color = c;  
	} 
//- A constructor with parameters to initialize all its instance variables. Do not implement a default constructor. The first Point passed to the constructor will be vertex A, the second Point vertex B, and so on.
	Point getVertexA(){ return A;} // - Returns the Point representing vertex A of the Triangle.
	Point getVertexB(){return B;} //- Returns the Point representing vertex B of the Triangle.
	Point getVertexC(){return C;} // - Returns the Point representing vertex C of the Triangle.
	Color getColor(){return color;} //- Returns the java.awt.Color of the Shape.
	void setColor(Color c){color = c;} // Sets the java.awt.Color of the Shape.
	double getArea(){return (.05*(A.getX()*(B.getY()-C.getY())+B.getX()*(C.getY*() - A.getY() ) + C.getX() * ( A.getY() - B.getY() ))} // - Returns the area of the Shape
    	
	double getPerimeter(
	
	return ( Math.sqrt(Math.pow(C.getX()-B.getX(),2) +  Math.pow(C.getY()-B.getY(),2)) + Math.sqrt(Math.pow(A.getX()-C.getX(),2) +  Math.pow(A.getY()-C.getY(),2)
) + Math.sqrt( Math.pow(A.getX()-B.getX(),2) +  Math.pow(A.getY()-B.getY(),2)) );
	} // - Returns the perimeter of the Shape
    	void translate(Point p){center = p;}// - Translates the entire shape by the (x,y) coordinates of a given java.awt.Point




}
