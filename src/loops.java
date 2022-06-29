public class loops {
    public static void main(String[] args) {
        // 1 to 3 numbers print
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        // 1 to 100 number print
        for(int i=1; i<5; i++) {
            System.out.println(i);
        }

        //while loop
        int j=1;
        while(j<5){
            System.out.println(j);
            j=j+1;
        }

        //do while loop
        int k=5;
        do {
            System.out.println(k);
            k=k-1;
        } while(k>1);
    }

}
