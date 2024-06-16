public class Basics_Switc {
    public static void main(String args[]){
        //Lets see Switch case 
        System.out.println("************ Switch cases **************");
        //this code can be used for appointment with some more conditions 
        int Day=(int)(Math.random()*8);
        System.out.println(Day);
        switch (Day) {
        case 1:
        System.out.println("Monday");
        break;
        case 2:
        System.out.println("Tuesday");
        break;
        case 3:
        System.out.println("Wednesday");
        break;
        case 4:
        System.out.println("thursday");
        break;
        case 5:
        System.out.println("Friday");
        break;
        case 6:
        System.out.println("Satuarday");
        break;
        case 7:
        System.out.println("Sunday");
        break;          
        default:
        System.out.println("No day is free in this week,try next week");
         break;
        }
    }
}
