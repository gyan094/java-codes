import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //conditional statement switch
        System.out.print("number of day : ");
        Scanner sc= new Scanner(System.in);  //user input day
        int day= sc.nextInt();
   // int day=2;
        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thr");
                break;
            default:
                System.out.println("fri - sun ");
        }
    }
}
