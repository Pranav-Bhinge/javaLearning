public class basics_ifelse {
    public static void main(String args[]){
        System.out.println("Lets see about java if-else statements by a program");
        System.out.println("*********Check if it is a even or odd*********");
        int Num= (int)(Math.random()*100);                       //here we revised the math function of random numbers
        System.out.println(Num);
        if (Num%2==0) {                                         //here we checked odd even
            System.out.println(Num+" "+"Is even number");       //here we revised the string  concatiation
        }
        else{
            System.out.println(Num+" "+"Is odd number");
        }

            System.out.println("***********check if the number is negative positive or 0 is elseif condition**********");
        //lets take another example this time do elseif condition
        int num=0;
        if (num>0){
            System.out.println("Is positive");
        }
        else if(num<0){
            System.out.println("Is negative");
        }
        else{
            System.out.println("Num is 0");
        }
    }
}
