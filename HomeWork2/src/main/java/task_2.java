import java.util.Random;

/*
Если необходимо, исправьте данный код
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
 */
public class task_2 {
    public static void main(String[] args) {
//        try {
//            int d = 0;
//            int[] intArray = new int[10];
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Catching exception: " + e);
//        }
        //---перерешал 2 задание
        int[] intArray = new int[new Random().nextInt(0, 15)];
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
