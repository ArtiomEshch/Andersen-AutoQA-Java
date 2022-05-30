package school.lesson_4.animals;

public class Animal {

    private String name;
    private int appetite;
    public static int animalsNumber = 0;

    public Animal(String name) {
        this.name = name;
        animalsNumber++;
    }

    public Animal(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        animalsNumber++;
    }

    public void swim(int distanse){}

    public void run(int distanse){}

    public void eat(Plate plate){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                '}';
    }
}
