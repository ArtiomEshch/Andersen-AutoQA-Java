package school.lesson_4.animals;

public class Plate {

    private int meal;

    public Plate(int meal) {
        this.meal = meal;
    }

    public void decreaseMeal(int n) { // отнимает еду
        this.setMeal(this.getMeal() - n);
    }

    public void addMeal(int n) { // добавляет еду
        this.setMeal(this.getMeal() + n);
    }

    public int getMeal() {
        return meal;
    }

    public void setMeal(int meal) {
        this.meal = meal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plate plate = (Plate) o;

        return meal == plate.meal;
    }

    @Override
    public int hashCode() {
        return meal;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "meal=" + meal +
                '}';
    }
}
