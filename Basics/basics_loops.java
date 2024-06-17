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
            System.out.print("* ");
        }
            System.out.println();
        }
    
    //reverse order
    System.out.println("******reverse order loop*******");

    int term=6;
    for (int i = 1; i <=term; i++) {                //here we have to take variable we cannot give direct i<=5and j=i 
                                                    //cause we have initialize i with 1 we have to reverse it so wehave to start with max which is 6 here
        for (int j = term; j >=i; j--) {
            System.out.print("* ");
        }
            System.out.println();
        }
    
        //while loop 
        System.out.println("****** While Loop *******");
        int i=0;
        while(i<=10){
            System.out.println(i);
            i++;
        }

}
}
