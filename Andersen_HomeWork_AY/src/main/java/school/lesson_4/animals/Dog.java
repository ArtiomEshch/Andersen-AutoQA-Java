package school.lesson_4.animals;

public class Dog extends Animal {

    final static int MAX_RUN_DISTANCE = 500;
    final static int MAX_SWIM_DISTANCE = 10;
    public static int dogNumber = 0;

    private String name;

    public Dog(String name) {
        this.name = name;
        animalsNumber++;
        dogNumber++;
    }

    public void swim(int distanse) {
        if (distanse < 0) {
            System.out.println("Дистанция не может быть отрицательной");
        } else if (distanse <= MAX_SWIM_DISTANCE) {
            System.out.println(this.getName() + " проплыл " + distanse + " м");
        } else {
            System.out.println("Собака не может проплыть больше " + MAX_SWIM_DISTANCE + " м");
        }
    }

    public void run(int distanse) {
        if (distanse < 0) {
            System.out.println("Дистанция не может быть отрицательной");
        } else if (distanse <= MAX_RUN_DISTANCE) {
            System.out.println(this.getName() + " пробежал " + distanse + " м");
        } else {
            System.out.println("Собака не может пробежать больше " + MAX_RUN_DISTANCE + " м");
        }
    }

    public void eat(Plate plate) {
        System.out.println("В этой задаче кушают только коты");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return name != null ? name.equals(dog.name) : dog.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
