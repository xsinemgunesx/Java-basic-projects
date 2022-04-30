public class Circle extends GeometricObject {
	private double radius;
	
	
	public  Circle() {
		
		
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public Circle(String color, boolean filled,double radius) {
		setColor(color);
		setFilled(filled);
		this.radius=radius;
		
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
		
	}
	public double getArea() {
		return radius*radius*Math.PI;
        	
		
	}
	public double getDiameter() {
		return 2*radius;
		
	}
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	public void printCircle() {
		
		System.out.println("The circle is created " + getDateCreated() + "and the radius is "+ radius);
				
	}
	

}
class GeometricObject {
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;
	public GeometricObject() {
		dateCreated=new java.util.Date();
	}
	public GeometricObject(String color, boolean filled) {
		dateCreated:new java.util.Date();
		this.color=color;
		this.filled=filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String toString() {
		return "created on"+dateCreated+"\ncolor"+color+" and filled"+filled;
				
	}
  class Rectangle extends GeometricObject {

	private double width;
	private double height;
	
	public Rectangle() {
			
	}
	public Rectangle(double width,double height) {
		this.height=height;
		this.width=width;
	}
	public Rectangle(double width,double height,String color
			,boolean filled	) {
		super(color,filled);
		this.height=height;
		this.width=width;
		
		
	}
		public double getWidth() {
			return width;
		}
		public void setWidth(double widt) {
			this.width=width;
			
		}
		public double getHeight() {
			return height;
			
		}
		public void setHeight(double height) {
			this.height=height;
		}
		public double getArea() {
			return width*height;
		}
		public double getPerimeter() {
			return 2*(width+height);
		}
		
}
  class TestCircleRectangle {

	
	public static void main(String[] args) {
		Circle circ=new Circle(1);
		System.out.println("A circle is "+circ.toString());
		System.out.println("The color is "+circ.getColor());
		System.out.println("The radius is "+circ.getRadius());
		System.out.println("The area is "+circ.getArea());
		System.out.println("The diameter is "+circ.getDiameter());
		
		
		Rectangle rect=new Rectangle(2,4);
		System.out.println("A rectangle is "+rect.toString());
		System.out.println("The color is "+rect.getColor());
		System.out.println("The perimeter is "+ rect.getPerimeter());
	
		
	}
	
}


