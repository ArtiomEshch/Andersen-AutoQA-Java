package school.lesson_4;

public class Park {

    int capacity;
    Attraction[] attractions;
    static int attractionsNumber = 0;

    public Park(int capacity) {
        this.capacity = capacity;
        this.attractions = new Attraction[capacity];
        System.out.println("Вы создали парк размером" + capacity);
    }

    public void addAttraction(String name, int workTine, int price) {
        if (attractionsNumber < this.attractions.length) {
            Attraction attraction = new Attraction(name, workTine, price);
            this.attractions[attraction.id] = attraction;
            attractionsNumber++;
            System.out.println("Аттракцион добавлен в парк под номером " + attraction.id);
        } else {
            System.out.println("В парке нет места");
        }
    }

    public void getInfo() {
        System.out.println("Количество аттракционов в парке: " + attractionsNumber);
        System.out.println("Количество свободного места: " + (attractions.length - attractionsNumber));
        for (Attraction element : attractions) {
            element.getInfo(element);
        }
    }

    private class Attraction {
        String name;
        int workTime;
        int price;
        int id;

        public Attraction(String name, int workTime, int price) {
            this.name = name;
            this.workTime = workTime;
            this.price = price;
            this.id = attractionsNumber;
        }

        private void getInfo(Attraction attraction) {
            System.out.println(attraction.toString());
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", workTime=" + workTime +
                    ", price=" + price +
                    '}';
        }
    }

}
