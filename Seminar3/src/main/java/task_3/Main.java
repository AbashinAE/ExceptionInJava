package task_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
1. Создайте класс исключения, который будет выбрасываться при делении на 0.
Исключение должно отображать понятное для пользователя сообщение об ошибке.
2. Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве с сылочного типа.
Исключение должно отображать понятное для пользователя сообщение об ошибке
3. Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */
public class Main {
    public static void main(String[] args) {

//    int a = 10;
//    int b = 0;
//
//        if (b == 0){
//            throw new DivisionByZeroException();
//        }

        // ================================

//        String[] strArr = {"123", null, "qwerty"};
//
//        for (int i = 0; i < strArr.length; i++) {
//            if (strArr[i] == null){
//                throw new NullPointerArrayException("элемент с индексом "+i+" NULL.");
//            }else{
//                System.out.println(strArr[i]);
//            }
//        }

        //=========================================
        File rndFile = new File("test2.txt");
        if (!rndFile.exists()) {
            try {
                throw new FileDontExistException();
            } catch (FileDontExistException ex) {
                ex.printStackTrace();
            }
        }

    }
}




