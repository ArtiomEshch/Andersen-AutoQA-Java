package school.lesson_4.animals;

public class Dog extends Animal {

    final static int MAX_RUN_DISTANCE = 500;
    final static int MAX_SWIM_DISTANCE = 10;
    public static int dogNumber = 0;

    public Dog(String name) {
        super(name);
        dogNumber++;
    }

    public Dog(String name, int appetite) {
        super(name, appetite);
        dogNumber++;
        animalsNumber++;
    }

    @Override
    public void swim(int distanse) {
        if (distanse < 0) {
            System.out.println("Дистанция не может быть отрицательной");
        } else if (distanse <= MAX_SWIM_DISTANCE) {
            System.out.println(this.getName() + " проплыл " + distanse + " м");
        } else {
            System.out.println("Собака не может проплыть больше " + MAX_SWIM_DISTANCE + " м");
        }
    }

    @Override
    public void run(int distanse) {
        if (distanse < 0) {
            System.out.println("Дистанция не может быть отрицательной");
        } else if (distanse <= MAX_RUN_DISTANCE) {
            System.out.println(this.getName() + " пробежал " + distanse + " м");
        } else {
            System.out.println("Собака не может пробежать больше " + MAX_RUN_DISTANCE + " м");
        }
    }

    @Override
    public void eat(Plate plate) {
        System.out.println("В этой задаче кушают только коты");
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}
