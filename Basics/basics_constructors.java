class constructor{
    constructor(){                                            //create default constructor
        System.out.println("normal/default constructor");
    }
}

class parameterizedconstructor{
    String Firstname;                                   //paramter for constructor
    String Lastname;
 parameterizedconstructor(String Firstname,String Lastname){           //creating prameterized constructor
    this.Firstname=Firstname; //here the name of atribute name in above
    this.Lastname=Lastname;   // class and constructor are same to refer from construtor we use this 
 }
 void show(){
    System.out.println(Firstname+" "+Lastname);         // creating method
 }
}

 class parameterizedconstructor1{
    String course;
    String name;

    parameterizedconstructor1(String c,String n){           //creating prameterized constructor
        course=c;                       //but here we gave diffrent names to atributes so we dont need to this keyword 
        name=n;
    }
     void display(){
        System.out.println(course+" "+name);
    }
}

public class basics_constructors {
    public static void main(String args[]){
            System.out.println("********constructor*********");
            constructor con=new constructor();                              //creating a object is only thing needed to call constructor
        
            System.out.println("********Parameterized constructor with this keyword*********");
            parameterizedconstructor prcon1=new parameterizedconstructor("Pranav", "Bhinge");    //creating object and giing parameter for parameterized constructor
            prcon1.show();      // calling method
            System.out.println("********Parameterized constructor without this keyword*********");
            parameterizedconstructor1 c1=new parameterizedconstructor1("Full Stack", "Java");
            c1.display();
        }
}
