package OOPS;
//*********************************Single Inheritance******************************* */
class Animal{      //Parent class
    void eat(){System.out.println("Eating");}
}
class Dog extends Animal{     //child class                       //here we use extends to inherit the property of animal class
    void bark(){System.out.println("Barking");}
}
public class Inheritance {
    public static void main (String args[]){
        System.out.println("************Inheritance*********");
        System.out.println("************Single Inheritance*********");

        Dog d1=new Dog();        //created refrence variable/obj
        d1.bark();                 //called method from its own class
         d1.eat();                //called method from parent class
    }
}
