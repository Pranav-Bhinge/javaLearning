package OOPS;
class Animal3{                                             //parent class 
    void Eat(){System.out.println("Eating........");}
}
class Dog3 extends Animal3 {                                //child class inheriting parent class
    void Bark(){System.out.println("Barking.....");}
}
class Cat1 extends Animal3{                                 //child2 class also inheriting from parent class
    void Meow(){System.out.println("Meow......");}
}
public class hierarchicalinheritance3 {
    public static void main(String args[]){
        System.out.println("****************Hierarchical Inheritance*****************");
        Cat1 c1=new Cat1();
        Dog3 d1=new Dog3();
        c1.Meow();
        c1.Eat();
        d1.Bark();
        d1.Eat();
    
    }
}
