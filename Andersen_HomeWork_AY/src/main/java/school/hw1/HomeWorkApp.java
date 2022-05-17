package school.hw1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();

        checkSumSign(-1, -2); // "Сумма отрицательная"
        checkSumSign(-1, 1); // "Сумма положительная"

        printColor(0); // "Красный"
        printColor(100); // "Желтый"
        printColor(200); // "Зеленый"

        compareNumbers(1, 1); // "a >= b"
        compareNumbers(1, 2); // "a < b"
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        String message = a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(message);
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        String message = a >= b ? "a >= b" : "a < b";
        System.out.println(message);
    }
}
