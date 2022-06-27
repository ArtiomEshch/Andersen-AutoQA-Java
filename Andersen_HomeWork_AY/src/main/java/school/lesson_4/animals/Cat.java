package school.lesson_4.animals;

public class Cat extends Animal {

    final static int MAX_RUN_DISTANCE = 200;
    public static int catNumber = 0;
    private boolean satiety = false;

    public Cat(String name) {
        super(name);
        catNumber++;
    }

    public Cat(String name, int appetite) {
        super(name, appetite);
        catNumber++;
    }

    @Override
    public void swim(int distanse) {
        System.out.println("Коты не умеют плавать");
    }

    @Override
    public void run(int distanse) {
        if (distanse < 0) {
            System.out.println("Дистанция не может быть отрицательной");
        } else if (distanse <= MAX_RUN_DISTANCE) {
            System.out.println(this.getName() + " пробежал " + distanse + " м");
        } else {
            System.out.println("Кот не может пробежать больше " + MAX_RUN_DISTANCE + " м");
        }
    }

    @Override
    public void eat(Plate plate) {
        if (plate.getMeal() < this.getAppetite()) {
            System.out.println(this.getName() + " не наелся");
        } else {
            plate.decreaseMeal(this.getAppetite());
            this.setSatiety(true);
            System.out.println(this.getName() + " наелся");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "satiety=" + satiety +
                '}';
    }
}
