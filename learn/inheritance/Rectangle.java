package inheritance;

public class Rectangle {
    protected double length;
    protected double width;
    protected double sides =4;

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
    public double calculateArea(){
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
    public double getSides(){
        return sides;
    }
    public void setSides(double sides){
        this.sides=sides;
    }
    public void print(){
        System.out.println("I am a rectangle");
    }
}
