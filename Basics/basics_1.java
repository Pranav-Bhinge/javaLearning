public class basics_1{
    public static void main(String args[]){
        System.out.println("Hello It's my first Program");

        //basic operation in Java
        System.out.println("Lets see about Data Types");
        //int myint=20;                        Integer(Whole Number)
       // float myfloat=3.088F;                Floating number(Decimal)
        //char mychar='B';                     Character
    // boolean Mybool="True";                   boolean  {true/False}
        String mystring="Pranav Bhinge";       //String 
        System.out.println(mystring);

        //Type Casting
        System.out.println("Lets see TypeCasting");
       // int mynum=10;
        //float myfloat=mynum;
        //System.out.println(mynum);
        //System.out.println(myfloat);

        //lets see real life example of it
        System.out.println("Real life example of type casting");
        int maxmarks=500;
        int usermarks=456;
        float percentage=(float) usermarks/maxmarks*100.00F;
        System.out.println(percentage); 
    }
}