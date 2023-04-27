import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа
(типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
необходимо повторно запросить у пользователя ввод данных.
2. Если необходимо, исправьте данный код
(задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

3. Дан следующий код, исправьте его там, где требуется
(задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

4. Разработайте программу, которая выбросит Exception,
когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

 */
public class Main {
    //public static void main(String[] args) {
    //number();
    //div();
    //}

    // ----------------- Task 1 ------------------------
    public static void number() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите число: ");
            float number = sc.nextFloat();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("Неверно введены данные! Повторите ввод, необходимо ввести число ");
            number();
        }
    }
// ----------------- Task 2 ------------------------

    public static void div() {
        int[] intArray = {2, 4, 5, 6, 4, 32, 1, 5};
        System.out.println(Arrays.toString(intArray));
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

// ----------------- Task 3 ------------------------

//    public static void main(String[] args) throws Exception {
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = {1, 2};
//            abc[3] = 9;
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//
//        }
//    }
//
//    public static void printSum(Integer a, Integer b) {
//        System.out.println(a + b);
//    }
// ----------------- Task 4 ------------------------

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = sc.nextLine();

        try {
            if(input.isEmpty()) {
                throw new Exception("Вы ввели пустую строку!!!");
            }
            System.out.println("Вы ввели: " + input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}