/*
Дан следующий код, исправьте его там, где требуется
public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}

 */
public class task_3 {
    public static void main(String[] args) {
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = { 1, 2 };
//            abc[3] = 9;
//
//
//        }catch (ArithmeticException ex) {
//            System.out.println(" ");
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        }catch (Exception ex) {
//            System.out.println("Что-то пошло не так...");
//        }
//
//    }
//    public static void printSum(Integer a, Integer b){
//        System.out.println(a + b);
        //-------перерешал 3 задание
        int a = 90;
        int b = 3;
        printSum(23, 234);
        int[] abc = { 1, 2 };
        try {
            System.out.println(a / b); // возможно деление на 0
            abc[3] = 9; // возможен выход за пределы массива
        } catch (ArithmeticException ex) {
            System.out.println("Ошибка " + ex);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера! " + ex);
        }
   }
    private static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
