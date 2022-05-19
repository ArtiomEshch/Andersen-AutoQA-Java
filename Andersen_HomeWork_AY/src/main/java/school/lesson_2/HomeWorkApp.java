package school.lesson_2;

import java.util.Arrays;

public class HomeWorkApp {

    public static boolean checkSum(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum >= 10 && sum <= 20;
    }

    public static void printValueNumber(int number) {
        String message = number < 0 ? "Number is negative" : "Number is positive";
        System.out.println(message);
    }

    public static boolean checkNegativeNumber(int number) {
        return number < 0;
    }

    public static void printString(String string, int numberOfTimes) {
        if (numberOfTimes <= 0 || string == null || string.equals("")) {
            System.out.println("Не корректное значение строки или количества вывода");
        } else {
            for (int i = 0; i < numberOfTimes; i++) {
                System.out.println(string);
            }
        }
    }

    public static boolean checkLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void arrayChange() {
        int[] testArray = {1, 1, 1, 0, 0, 1, 0, 1};
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = testArray[i] == 1 ? 0 : 1;
        }
        System.out.println(Arrays.toString(testArray));
    }

    public static void fillArray() {
        int[] testArray = new int[100];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(testArray));
    }

    public static void increaseArrayElement() {
        int[] testArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i] < 6) testArray[i] *= 2;
        }
        System.out.println(Arrays.toString(testArray));
    }

    public static int[][] squareArray(int value) {
        int[][] testArray = new int[value][value];

        int tmp1 = 0;
        // tmp1 - смещает индекс во вложенном массиве от нулевого элемента к конечному
        int tmp2 = testArray.length - 1;
        // tmp2 -смещает индекс во вложенном массиве от конечноо элемента к первому
        for (int i = 0; i < testArray.length; i++) {
            testArray[i][tmp1] = 1;
            testArray[i][tmp2] = 1;
            tmp1++;
            tmp2--;
        }
        return testArray; // расширил метод, чтобы можно было тестить
    }

    public static int[] returnArray(int len, int initialValue) {
        if (len < 1) {
            throw new NullPointerException("Сохдать такой массив длинной < 0 нельзя");
        }
        int[] result = new int[len];
        Arrays.fill(result, initialValue);
        return result;
    }

    public static int[] offsetArray(int[] array, int position) {
        // position > 0 - элементы смещаются влево
        // position < 0 - элементы смещаются вправо
        if (array.length == 1 || position == 0) return array;
        int element1;
        int element2;
        if (position > 0) {
            for (int i = 0; i < position; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    element1 = array[j];
                    element2 = array[j + 1];
                    array[j] = element2;
                    array[j + 1] = element1;
                }
            }
        } else {
            for (int i = position; i < 0; i++) {
                for (int j = array.length - 1; j > 0; j--) {
                    element1 = array[j];
                    element2 = array[j - 1];
                    array[j] = element2;
                    array[j - 1] = element1;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {

        System.out.println(checkSum(6, 6)); // true
        System.out.println(checkSum(12, 12)); // false

        printValueNumber(1); // Number is positive
        printValueNumber(-1); // Number is negative

        System.out.println(checkNegativeNumber(1)); // false
        System.out.println(checkNegativeNumber(-1)); // true

        printString("Test Case", 0); // не валидное значение
        printString("Test Case", 2); // вывод в консоль 2 раза
        printString(null, 2); // не валидное значение
        printString("", 2); // не валидное значение

        System.out.println(checkLeapYear(8)); // true
        System.out.println(checkLeapYear(100)); // false

        arrayChange(); // [1, 1, 1, 0, 0, 1, 0, 1] to [0, 0, 0, 1, 1, 0, 1, 0]

        fillArray(); // создает массив

        increaseArrayElement(); // create [2, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 2]

        squareArray(7); // матрица 7 на 7 с единицами по диагонали

        System.out.println(Arrays.toString(returnArray(2, 4))); // [4, 4]

        int[] test1 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(offsetArray(test1, 1))); // [2, 3, 4, 1]
        int[] test2 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(offsetArray(test2, -1))); // [4, 1, 2, 3]
    }
}

