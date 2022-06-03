package school.lesson_5.box;

import java.util.ArrayList;

public class Box<T> {
    float currentWeight = 0;
    ArrayList<T> fruitList;

    public Box() {
        this.fruitList = new ArrayList<T>();
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
        System.out.println("The fruit have added in box");

    }

    public float getWeight(Fruit f) {
        currentWeight = fruitList.size() * f.weight;
        return currentWeight;
    }


    public boolean compare(Box box) {
        if (currentWeight == box.currentWeight)
            return true;
        return false;
    }

    public void transferFruit(Box box) {
        if (fruitList.get(0).getClass() == box.fruitList.get(0).getClass()) {
            fruitList.addAll(box.fruitList);
            box.fruitList.removeAll(fruitList);
            System.out.println("Фрукты перенесли");
        } else {
            System.out.println("Нельзя соединить такие коробки");
        }
    }

}
