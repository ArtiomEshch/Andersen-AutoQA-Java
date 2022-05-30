package school.lesson_4.animals;

public class Cat extends Animal {

    final static int MAX_RUN_DISTANCE = 200;
    public static int catNumber = 0;
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name) {
        this.name = name;
        animalsNumber++;
        catNumber++;
    }

    public Cat(String name, int appetite) {
        this(name);
        this.appetite = appetite;
    }

    public void swim(int distanse) {
        System.out.println("Коты не умеют плавать");
    }

    public void run(int distanse) {
        if (distanse < 0) {
            System.out.println("Дистанция не может быть отрицательной");
        } else if (distanse <= MAX_RUN_DISTANCE) {
            System.out.println(this.getName() + " пробежал " + distanse + " м");
        } else {
            System.out.println("Кот не может пробежать больше " + MAX_RUN_DISTANCE + " м");
        }
    }

    public void eat(Plate plate) {
        if (plate.getMeal() < this.getAppetite()) {
            System.out.println(this.getName() + " не наелся");
        } else {
            plate.decreaseMeal(this.getAppetite());
            this.setSatiety(true);
            System.out.println(this.getName() + " наелся");
        }
    }

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

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (appetite != cat.appetite) return false;
        if (satiety != cat.satiety) return false;
        return name != null ? name.equals(cat.name) : cat.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + appetite;
        result = 31 * result + (satiety ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}
