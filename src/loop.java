import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        //use do while loop and print user number
        Scanner sc= new Scanner(System.in);
         int number=0;
        do {
            System.out.println("inter a number");
            number = sc.nextInt();
            System.out.print("here is your number ");
            System.out.println(number);
        }while(number>=0);
        System.out.println("the end");
    }
}
