import java.util.Scanner;

public class takeinput {
    public static void main(String[] args) {
        // how to take input

        //intiger value
        Scanner sc = new Scanner(System.in);
        System.out.println("input your age : ");
        int age =sc.nextInt();
        System.out.println(age); //40

        //float value
        Scanner scm = new Scanner(System.in);
        System.out.println("input your age : ");
        float ages =scm.nextFloat();
        System.out.println(ages);   //40.0

        //string name   sigal token
        Scanner gp = new Scanner(System.in);
        System.out.println("input your name : ");
        String name =gp.next();
        System.out.println(name);   //gyan prakash = gyan    next=singal tokel

        //all line print
        Scanner k = new Scanner(System.in);
        System.out.println("input your name : ");
        String names =k.nextLine();
        System.out.println(names);  //gyan prakash print all token


    }
}

