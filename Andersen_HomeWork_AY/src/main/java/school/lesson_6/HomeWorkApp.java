package school.lesson_6;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {

        String s1 = "1";
        String[][] tast1 = new String[4][4];
        for (String[] value : tast1) {
            Arrays.fill(value, s1);
        }

        String s2 = "a";
        String[][] tast2 = new String[4][4];
        for (String[] strings : tast2) {
            Arrays.fill(strings, s2);
        }

        String[][] tast3 = new String[5][5];

        try {
            System.out.println(fillArray(tast1));
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка недопустимого размера обработана");
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка приведения типов обработана");
        }

        try {
            System.out.println(fillArray(tast2));
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка недопустимого размера обработана");
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка приведения типов обработана");
        }

        try {
            System.out.println(fillArray(tast3));
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка недопустимого размера обработана");
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка приведения типов обработана");
        }
    }

    public static int fillArray(String[][] testArray) throws MyArraySizeException, MyArrayDataException {
        if (testArray.length > 4 || testArray[0].length > 4) throw new MyArraySizeException();
        int result = 0;
        for (int i = 0; i < testArray.length; i++) {
            for (int j = 0; j < testArray[i].length; j++) {
                try {
                    result += Integer.parseInt(testArray[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("В ячейке [" + i + "][" + j + "] не корректное значение.");
                    throw new MyArrayDataException();
                }

            }
        }
        return result;
    }
}
