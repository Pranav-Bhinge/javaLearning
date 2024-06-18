public class basics_methods {

    //lets see methods this is my first method  
    private static void MyMethod(){
        System.out.println("this is my firt method");
        }
        //parameterized method
        private static void Goodmorning(String name){
            System.out.println("Good morning"+" "+name);
        }
        // multiple parameters 
         static void checkage(int Age,String name){
            if(Age<18){
                System.out.println(name+" "+"Is a minor");
            }
            else{
                System.out.println(name+" "+"Is a adult");
            }
         }
    public static void main(String args[]){
        MyMethod(); 
        Goodmorning("Pranav");
        checkage(18, "Pranav");
        
        
        
        
} 
}

