package abstraction.shapes;

public class Rectangle extends Shape{
    private double length;
    private double width;

    //default constructor
    public Rectangle(){
        length=0;
        width=0;
    }
    public Rectangle(double length,double width){
        setLength(length);
        setWidth(width);
    }
    //methods
    public double calculatePerimeter(){
        return (2*length) + (2*width);
    }
    @Override
    double calculateArea(){
        return length*width;
    }
    //getters and setters
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getWidth(){
        return length;
    }
    public void setWidth(double width){
        this.width=width;
    }
}
