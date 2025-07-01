package Inheritance;
class Animal{
    public void eatFood(){
        System.out.println("Animals Eat Food");
    }

}
class Dog extends Animal{
    public void bark(){
        System.out.println("The Dog Barks ");
    }
}

public class Example3 {
    public static void main(String[] args) {
     Dog myDog = new Dog();
     myDog.eatFood();
     myDog.bark();

    }
}
