import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class dz2 {
//unchecked - обрабатываем через if
    //checked - через try
    /*
    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
    Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */
//    public static void main(String[] args) {
//       boolean isExit = false;
//        while(!isExit) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Введите дробное число");
//            String temp = scanner.next();
//            try {
//                double d = Double.parseDouble(temp);
//                System.out.println("Вы ввели число: " + d);
//                isExit = true;
//
//            } catch (NumberFormatException e) {
//                System.out.print("Осуществлен ввод текста. ");
//            }
//        }
//        System.out.println("Окончание программы");
//    }
//}

    //    Если необходимо, исправьте данный код (задание 2
//    public static void main(String[] args) {
//        int[] intArray = new int[9];
//        intArray[8] = 10;
//        int d = 0;
//        if(d==0){
//            System.out.println("Ошибка, на ноль делить нельзя");
//            throw new ArithmeticException();
//        } else{
//            double catchedRes1 = intArray[8] / d;
//            System.out.println(catchedRes1);
//        }
//
//
//    }
//}
//На семинаре было сказано, что unchecked-исключения предпочтительнее обрабатывать с помощью оператора if.
// Руководствуясь этим, я заменил блок try-catch на проверку с помощью оператора if.


    //Дан следующий код, исправьте его там, где требуется (задание 3
//
//    public static void main(String[] args) throws Exception {
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = {1, 2};
//            abc[3] = 9;
//
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        }
//    }
//    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//        System.out.println(a + b);
//    }
//}
        //Задание 4
//    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//    Пользователю должно показаться сообщение, что пустые строки вводить нельзя. Далее запросить повторный ввод строки


    public static void main(String[] args) {
       boolean isExit = false;
        while(!isExit) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст");
            String temp = scanner.nextLine();
            if(temp.isEmpty()){
                System.out.print("Пустые строки вводить нельзя. ");
            }else{
                System.out.println("вы ввели: " + temp);
                isExit = true;
            }
        }
        System.out.println("Окончание программы");
    }
}