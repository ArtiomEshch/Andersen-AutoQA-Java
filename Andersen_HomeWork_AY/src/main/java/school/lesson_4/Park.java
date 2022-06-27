package school.lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class Park {

    private int capacity;
    private Attraction[] attractions;
    private int attractionNumber = 0;

    public class Attraction {
        private String name;
        private int minutesOfWork;
        private int price;

        public Attraction(String name, int minutesOfWork, int price) {
            this.name = name;
            this.minutesOfWork = minutesOfWork;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMinutesOfWork() {
            return minutesOfWork;
        }

        public void setMinutesOfWork(int minutesOfWork) {
            this.minutesOfWork = minutesOfWork;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }

    public Park(int capacity) {
        this.capacity = capacity;
        this.attractions = new Attraction[capacity];
    }

    public void addAttraction() {
        if (attractionNumber < capacity) {
            System.out.println("Введите информацию об аттракционе");
            Scanner inputData = new Scanner(System.in);
            System.out.print("Название: ");
            String name = inputData.next();
            System.out.print("Цена: ");
            int price = inputData.nextInt();
            System.out.print("Сколько минут работает: ");
            int minutesOfWork = inputData.nextInt();
            attractions[attractionNumber] = new Park.Attraction(name, minutesOfWork, price);
            attractionNumber++;
            System.out.println("Аттракцион добавлен");
        } else {
            System.out.println("В парке кончилось место");
        }
    }

    public void addAttraction(String name, int minutesOfWork, int price) {
        if (attractionNumber < capacity) {
            attractions[attractionNumber] = new Park.Attraction(name, minutesOfWork, price);
            attractionNumber++;
            System.out.println("Аттракцион добавлен");
        } else {
            System.out.println("В парке кончилось место");
        }
    }

    public void printInfo() {
        System.out.println("В парке расположены следующие аттракционы: ");
        for (Attraction attraction : this.attractions) {
            System.out.println("Название: " + attraction.name);
            System.out.println("Время работы " + attraction.minutesOfWork + " минут");
            System.out.println("Цена за одно посещение: " + attraction.price + " рублей");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Park park = (Park) o;

        if (capacity != park.capacity) return false;
        if (attractionNumber != park.attractionNumber) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(attractions, park.attractions);
    }

    @Override
    public int hashCode() {
        int result = capacity;
        result = 31 * result + Arrays.hashCode(attractions);
        result = 31 * result + attractionNumber;
        return result;
    }

    @Override
    public String toString() {
        return "Park{" +
                "capacity=" + capacity +
                ", attractions=" + Arrays.toString(attractions) +
                ", attractionNumber=" + attractionNumber +
                '}';
    }
}