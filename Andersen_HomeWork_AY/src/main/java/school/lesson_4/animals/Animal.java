package school.lesson_4.animals;

public abstract class Animal {
    public static int animalsNumber = 0;

    public abstract void swim(int distanse);

    public abstract void run(int distanse);

    public abstract void eat(Plate plate);
}
