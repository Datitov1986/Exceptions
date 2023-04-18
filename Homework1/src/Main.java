/*
1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен разности элементов
двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
как-то оповестить пользователя.
* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен частному элементов двух
входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение,
которое пользователь может увидеть - RuntimeException, т.е. ваше.

 */

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // printLength(null);
        int[] array = {1,2,3,4,5};
        int[] array2 = {0,1,3,4,0};
        //getElementAtIndex(array,6 );
        convertToInt("abcdr123");
        int[] arr = createRandomArray(5);
        int[] arr1 = createRandomArray(5);
        int[] arr2 = createRandomArray(10);
        System.out.println("Ваш первый массив: " + Arrays.toString(arr));
        System.out.println("Ваш второй массив: " + Arrays.toString(arr1));
        System.out.println("Ваш новый массив, " +
                "состоящий из разности элементов двух массивов: "
                + Arrays.toString(difArrays(arr, arr1)));
        //System.out.println(Arrays.toString(difArrays(arr, arr2)));
        System.out.println(Arrays.toString(divArrays(array,array2)));

    }

    // ----------------- Task 1----------------------------

    /**
     * Метод, выбрасывающий исключение, если
     * переданный ему параметр имеет
     * значение null
     */

    public static void printLength(String str) {
        if (str == null) {
            throw new NullPointerException("Строка null");
        }
        System.out.println("Длина строки: " + str.length());
    }

    /**
     * Метод, выбрасывающий исключение,
     * если индекс, передаваемый в качестве параметра,
     * не находится в диапазоне допустимых
     * значений массива
     */
    public static void getElementAtIndex(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Индекс не в диапазоне массива");
        }
        System.out.println("Элемент с индексом " + index + " : " + array[index]);
    }

    /**
     * Метод, выбрасывающий исключение,
     * если переданный ему параметр не может быть
     * преобразован в числовое значение
     */
    public static void convertToInt(String str) {
        int num;
        try {
            num = Integer.parseInt(str);
            System.out.println("Конвертированное значение: " + str);
        } catch (NumberFormatException e) {
            System.out.println("Невозможно конвертировать в Integer: " + str);
        }
    }

    //----------------- Task 2----------------------------

    public static int[] difArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");

        }
        int[] difArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            difArr[i] = arr1[i] - arr2[i];
        }
        return difArr;
    }

    //----------------- Task *----------------------------
    public static int[] divArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");

        }
        int[] divArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new ArithmeticException("На ноль делить нельзя двоечник!!!");
            }
            divArr[i] = arr1[i] / arr2[i];
        }
        return divArr;
    }

    /**
     * Метод, создающий рандомный целочисленный массив
     * @param n количество элементов массива
     * @return возвращает созданный массив с рандомными элементами
     * в диапазоне от 0 до 19
     */
    public static int[] createRandomArray(int n) {
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(20);
        }
        return arr;
    }
}