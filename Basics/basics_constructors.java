class constructor{
    constructor(){
        System.out.println("normal/default constructor");
    }
}

class parameterizedconstructor{
    String Firstname;
    String Lastname;
 parameterizedconstructor(String f,String l){
    Firstname=f;
    Lastname=l;
 }
 void show(){
    System.out.println(Firstname+" "+Lastname);
 }

}
public class basics_constructors {
    public static void main(String args[]){
            System.out.println("********constructor*********");
            constructor con=new constructor(); 
        
            System.out.println("********Parameterized constructor*********");
            parameterizedconstructor prcon1=new parameterizedconstructor("Pranav", "Bhinge");
            parameterizedconstructor prcon2=new parameterizedconstructor("Raman", "Sangamnor");

            prcon1.show();
            prcon2.show();
        
        }
}
