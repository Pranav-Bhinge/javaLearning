package OOPS;

//***************************Multi-level Inheritance**************** */
class Animal1{                                           //parent class
    void Eat(){System.out.println("Eating.........");}
}
class Dog1 extends Animal1{                              //1st child class inheriting Parent class
    void Bark(){System.out.println("Barking...");}
}
class Puppy extends Dog1{                                //2nd child class inheriting from 1st child 
    void Weep(){System.out.println("Weaping.....");}
}
public class multilevelinheritance2 {
    public static void main (String args[]){
        System.out.println("********Multi-level Inheritance*********");
        Puppy p1=new Puppy();  //creating refrence variable/obj for 2nd child class
        p1.Eat();
        p1.Bark();
        p1.Weep();
    }
}
