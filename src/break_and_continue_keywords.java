public class break_and_continue_keywords {
    public static void main(String[] args) {
        // brack & continue
        int i =0;
        while(true){
            if (i==3||i==5){ //continue specific number is not print
                i=i+1;
                continue;
            }
            System.out.println(i);
            i=i+1;
            if (i>6){
                break;
            }
        }
    }
}
