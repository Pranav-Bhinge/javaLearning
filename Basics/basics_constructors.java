class constructor{
    constructor(){                                            //create default constructor
        System.out.println("normal/default constructor");
    }
}

class parameterizedconstructor{
    String Firstname;                                   //paramter for constructor
    String Lastname;
 parameterizedconstructor(String f,String l){           //creating prameterized constructor
    Firstname=f;
    Lastname=l;
    
 }
 void show(){
    System.out.println(Firstname+" "+Lastname);         // creating method
 }

}
public class basics_constructors {
    public static void main(String args[]){
            System.out.println("********constructor*********");
            constructor con=new constructor();                              //creating a object is only thing needed to call constructor
        
            System.out.println("********Parameterized constructor*********");
            parameterizedconstructor prcon1=new parameterizedconstructor("Pranav", "Bhinge");    //creating object and giing parameter for parameterized constructor
            parameterizedconstructor prcon2=new parameterizedconstructor("Raman", "Sangamnor");

            prcon1.show();      // calling method
            prcon2.show();
        
        }
}
