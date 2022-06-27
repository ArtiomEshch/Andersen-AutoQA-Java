package school.lesson_5;


import school.lesson_5.box.Apple;
import school.lesson_5.box.Box;
import school.lesson_5.box.Fruit;
import school.lesson_5.box.Orange;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        // Тест задания 1
        Integer[] array1 = {5, 9, 3, 6, 8};
        Integer[] array2 = null;
        System.out.println(Arrays.toString(TestMethod.swapArrayElements(array1, 0, 3)));
        // [6, 9, 3, 5, 8]

        // Тест задачи с коробкой фрутов
        Apple apl = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxApple = new Box<Apple>();
        boxApple.addFruit(apl);
        boxApple.addFruit(apl);
        boxApple.addFruit(apl);
        System.out.println(boxApple.getWeight(apl));

        Box<Orange> boxOrange = new Box<Orange>();
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        System.out.println(boxOrange.getWeight(orange));

        System.out.println(boxApple.compare(boxOrange));

        Box<Apple> boxAppleTwo = new Box<Apple>();
        boxAppleTwo.addFruit(apl);
        boxAppleTwo.addFruit(apl);

        boxApple.transferFruit(boxOrange);
        boxApple.transferFruit(boxAppleTwo);
        System.out.println(boxApple.getWeight(apl));
        System.out.println(boxAppleTwo.getWeight(apl));
    }
=======
public class HomeWorkApp {
}
