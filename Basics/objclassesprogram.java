import java.util.Scanner;

class circle{
    public static void area(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius=s.nextInt();
        float area= 3.14f*radius*radius;
        System.out.println("Area of circle withv radius"+" "+radius+" "+"is"+" "+area);
    }
}
public class objclassesprogram {
    public static void main(String args[]){
        circle c1=new circle();
        c1.area();
    }
}
