public class method_and_function {

             public static void printjava(){  //function
                 System.out.println("hello gyan");
             }

         public static void printname(String name) {  //string function
             System.out.println(name);
    }
    public static void printsum(int a, int b){
                 int sum =a+b;
        System.out.println(sum); //tow int number sum
    }
      public static void main(String[] args) {
                 //methods
         //  System.out.println("hello gyan");
        //  System.out.println("hello gyan");
       // System.out.println("hello gyan");

        printjava();
        printjava();    //call method to function

        printname("prakash");
        printname("durgesh");
        printname("abhay");  //call string function

          printsum(1,6);
          printsum(26,24); //two intiger addition

    }
}
