import java.util.Scanner;

public class logical_operator {
    public static void main(String[] args) {
        //logical operator
     /*   System.out.println("input a");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("input b");
        Scanner gp= new Scanner(System.in);
        int b=gp.nextInt();
      */
        //&& and
        int a=30;
        int b=40;

        if(a<50 && b<50)
        System.out.println("both less than 50");//all statement is true

        //|| or
        if(a<35 || b<35)
            System.out.println("atlest one less than 50");//atlest one statement is true


    }
}
