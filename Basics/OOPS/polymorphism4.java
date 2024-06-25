package OOPS;
//****************************Polymorphism*************************** */
//****************************this is also example of Heirarchical inheritance*************************** */
class Animal4{              //parent class 
    void animalsound(){System.out.println("Animal make sound");}    //made a method that will be modified 
}
class Pig extends Animal4 {//child class of animal
    void animalsound(){System.out.println("The pig says:wee.. wee...");}// updated method from animal class and defined it diffrently
}
class dog4 extends Animal4{//child class of animal
    void animalsound(){System.out.println("the dog says: Bow... Bow....");}  // again updated method from animal class and defined it diffrently
}
//here above we took one method and ued it diffrently in other classes this is polymorphism
 public class polymorphism4 {
    public static void main(String args[]){
        System.out.println("*********Polyorphisim**********");
        System.out.println("************************this is also example of Heirarchical inheritance***********************");
        Animal4 myanimal=new Animal4();
        Animal4 mypig=new Pig();
        Animal4 mydog=new dog4();
        myanimal.animalsound();
        mypig.animalsound();
        mydog.animalsound();



    }
}
