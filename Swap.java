public class Swap {
    public static void main(String[] args){
        float a = 5.0f;
        float b = 3.0f;
        // before Swapping
        System.out.println("Before Swapping " + a + " " +b);
        float temp = a;
         a = b ;
         b = temp;
        System.out.println("After Swapping " + a + " " + b);
    }
}
