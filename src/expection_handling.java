public class expection_handling {
    public static void main(String[] args) {
        //try -catch in exception handling
        int[] marks = {70,60,65};
        try{
            System.out.println(marks[5]);
        }
        catch (Exception exception){
            //do something after catching
            System.out.println("not avilable this index number");//5 index empti
        }
        System.out.println("the name is gyan");
    }
}
