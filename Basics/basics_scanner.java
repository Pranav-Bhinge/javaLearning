import java.util.Scanner;
public class basics_scanner {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=s.nextInt();            //we use nextInt for integer and use nextline for string
        System.out.println(num);
    }
}
