import java.util.Scanner;

public class conditional_statement {
    public static void main(String[] args) {
        //conditinal_statement
        Scanner sc =new Scanner(System.in);
        //pen=10   ;notebook 40

        int cash = sc.nextInt();
        if (cash <10) {
            System.out.println("can not buy anything");
            System.out.println("get more cash");
        }
            else if(cash>10 && cash<50) {
               System.out.println("can gate 1 thing");
            }
                else{
                    System.out.println("can get both");
                }
    }
}
