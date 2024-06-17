public class basics_loops {
    public static void main(String args[]){
        //lets see about loops in java for, nested for,for each,while and do while loop.
        System.out.println("*********for loop**********");
        for (int i = 0; i <6; i++) {            //this is simple for loop
            System.out.println(i);
        }

        System.out.println("******Nested for loop*******");
        for (int i = 1; i <=5; i++) {
        for (int j = 1; j <=i; j++) {
            System.out.println("* ");
        }
            System.out.println();
        }
    }
}
