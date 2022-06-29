public class Operators {
    public static void main(String[] args) {
        //operator

        //add
        int a = 20;
        int b= 30;
        int sum = a+b;
        System.out.println(sum);   //50

        //diff
        int c =30;
        int d=20;
                int sub =c-d;
        System.out.println(sub);    //10

        // mul
        float  e =20.5F;
        float f=10;
        double g=e*f;
        System.out.println(g);  //205.0

       //div
        float x=1;
        float y=2;
        float div=x / y;
        System.out.println(div);    //0.5

        //modulo
        double m=7;
        double n=3;
        double  modulo= m % n;
        System.out.println(modulo);  // 1.0

        //incremant/dicriment
         int p=5;
        System.out.println(p);
        System.out.println(p++);
        System.out.println(++p);
        System.out.println(--p);
        System.out.println(p);
        System.out.println(p--);
    }
}
