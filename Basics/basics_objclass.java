 
 class test{                        //created class here there will be only one public class
public static void add(int a,int b){    //method
     int c= a+b;
     System.out.println(c);
}
 }

public class basics_objclass {
    public static void main(String args[]){
        test a=new test();                      //created object
        a.add(2,3);                         //called method
    }
}
