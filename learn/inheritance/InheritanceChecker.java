//A superclass constructor is run before the subclass constructor
//If we want to call a superclass constructor it must be in the first line
//An explicit call can be made to the superclass constructor from one of the subclass constructor by using super()
//If the supperclass does not have a default constructor, the subclass must explicitly call one of its other constructors
package inheritance;

public class InheritanceChecker {
    public static void main(String[] args){
        //Person person = new Person();
        Employee employee = new Employee();

    }
}
