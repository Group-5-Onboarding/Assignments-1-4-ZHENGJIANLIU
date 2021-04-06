package AssignmentSet5;
class Point{
    private double xCoordindate;
	private double yCoordindate;
    
    public Point( double xCoordindate, double yCoordindate) {
    	this.xCoordindate = xCoordindate;
    	this.yCoordindate = yCoordindate;
    }
    
    public double calculateDistance() {
    	double distance = 0;
    	
    	distance = Math.sqrt(Math.pow((this.xCoordindate-0),2) + Math.pow((this.yCoordindate-0),2));
    	
    	return Math.round(distance*100.0)/100.0;
    }
    
    public double calculateDistance(Point point) {
    	double distance = 0;
    	
    	distance = Math.sqrt(
    			Math.pow((point.getxCoordindate()-this.xCoordindate),2) 
    			+ Math.pow((point.getyCoordindate()-this.yCoordindate),2)
    			);
    	
    	return Math.round(distance*100.0)/100.0;
    }
    
    public double getxCoordindate() {
		return xCoordindate;
	}

	public void setxCoordindate(double xCoordindate) {
		this.xCoordindate = xCoordindate;
	}

	public double getyCoordindate() {
		return yCoordindate;
	}

	public void setyCoordindate(double yCoordindate) {
		this.yCoordindate = yCoordindate;
	}
    
}

class Triangle {
	private Point point1;
	private Point point2;
	private Point point3;
	
	public Triangle() {
		this.point1 = new Point(0,0);
		this.point2 = new Point(1,1);
		this.point3 = new Point(2,5);
	}
	
	public Triangle(double point1XCoordinate, double point1YCoordinate, double point2XCoordinate, double point2YCoordinate, double point3XCoordinate, double point3YCoordinate){
		this.point1 = new Point(point1XCoordinate, point1YCoordinate);
		this.point2 = new Point(point2XCoordinate, point2YCoordinate);
		this.point3 = new Point(point3XCoordinate, point3YCoordinate);
	}
	
	public Triangle(Point point1,Point point2,Point point3) {
		this.point1= point1;
		this.point2= point2;
		this.point3= point3;
	}
	
	public double calculatePerimeter() {
		double a = point1.calculateDistance(point2);
		double b = point2.calculateDistance(point3);
		double c = point3.calculateDistance(point1);
		double perimeter = a+b+c;
		return Math.round(perimeter*100.0)/100.0;
	}
	
	public double calculateArea(){
		double s = this.calculatePerimeter()/2;
		double a = point1.calculateDistance(point2);
		double b = point2.calculateDistance(point3);
		double c = point3.calculateDistance(point1);
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return Math.round(area*100.0)/100.0;
	}
	
	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}
}


public class MethodOverLoadingAssignment2 {
	public static void main(String[] args) {
		Triangle triangle1 = new Triangle();
		Triangle triangle2 = new Triangle(1, 2, 6, 5, 5, 1);
		
		Point point1 = new Point(2, 1);
		Point point2 = new Point(4, 4);
		Point point3 = new Point(9, 1);
		
		Triangle triangle3 = new Triangle(point1, point2, point3);		
		
		System.out.println("Perimeter of triangle1 is "+triangle1.calculatePerimeter());
		System.out.println("Area of triangle1 is "+triangle1.calculateArea());
		
		System.out.println("Perimeter of triangle2 is "+triangle2.calculatePerimeter());
		System.out.println("Area of triangle2 is "+triangle2.calculateArea());
		
		System.out.println("Perimeter of triangle3 is "+triangle3.calculatePerimeter());
		System.out.println("Area of triangle3 is "+triangle3.calculateArea());
	}
//	public static void main(String[] args) {
//		Point point1 = new Point(3.5, 1.5);
//        Point point2 = new Point(6, 4);
//                                
//        System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
//        System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
//        System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2));
//        
//        //Create more objects for testing your code                
//
//	}
}
