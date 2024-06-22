import java.util.Scanner;

class circle{
    public float area(int r){
        float area= 3.14f*r*r;
        System.out.println("Area of circle withv radius"+" "+r+" "+"is"+" "+area);
        return area;
    }
}
public class objclassesprogram {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius");
        int r=s.nextInt();
        circle c1=new circle();
        c1.area(r);
    }
}
