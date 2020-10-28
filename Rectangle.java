public class Rectangle {

    double height;
    double width;
    public Rectangle(double wt, double ht){
    height = ht;
    width = wt;
    }
    public Rectangle(){
    height = 1;
    width = 1;
    } 
    public double getArea(){
    return height*width;
    }
    public double getPerimeter(){
    return 2*(height + width);
    }   
    public double getWidth(){
    return width;
    }
    public double getHeight(){
    return height;
    }  
    public static void main(String[] args){
	Rectangle box= new Rectangle();
    Rectangle box1 = new Rectangle(5, 50);
    Rectangle box2 = new Rectangle(2.5, 45.7); 
    System.out.println("Width of dafault box is: " +  box.getWidth());
    System.out.println("Height of default box is : " + box.getHeight());
    System.out.println("Perimeter of default box is : " + box1.getPerimeter());
    System.out.println("Area of the default box is : " + box1.getArea() + "\n");
    System.out.println("Width of box 1 is: " + box1.getWidth());
    System.out.println("Height of box 1 is : " + box1.getHeight());
    System.out.println("Perimeter of the box 1 is : " + box1.getPerimeter());
    System.out.println("Area of the box 1 is : " + box1.getArea() + "\n");
    System.out.println("Width of next box is : " + box2.getWidth());
    System.out.println("Height of next box is: " + box2.getHeight());
    System.out.println("Perimeter of next box is: " + box2.getPerimeter());
    System.out.println("Area of next box is: " + box2.getArea());
    }
}
