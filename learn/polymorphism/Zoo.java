package polymorphism;

public class Zoo {
    public static void main(String[] args){
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();
        sasha = new Cat();
        feed(sasha);
        

        //or
        //implicit type convertion from cat to animal object
        Animal sasha2 = new Cat();
        sasha2.makeSound();
        //to explicitly convert to cat object
        //((Cat)sasha2) temporarily convert to cat object
        ((Cat)sasha2).scratch();
        

        //or
        Animal sashaDog = new Dog();
        //explicitly type casting  sashaDog(Animal) to sashaTheDog(Dog)
        Dog sashaTheDog = (Dog)sashaDog;

        ////////////////////////////////////////
        //This won't throw any exception at compilation
        //by while execution it will
        //as "Dog" is not a subclass of "Cat"
        Animal sashaerror = new Cat();
        Dog sashaErrorDog = (Dog)sasha;

        ////////////////////////////////////////
    }
    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("here's your dog food");
        }
        else if(animal instanceof Cat){
            System.out.println("here's your cat food");
        }
    }
}
