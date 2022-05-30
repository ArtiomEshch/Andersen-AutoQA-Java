package school.lesson_4;

import java.util.Scanner;

public class Park {

    private int capacity;
    private Attraction[] attractions;

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
        Scanner inputData = new Scanner(System.in);
        for (int i = 0; i < attractions.length; i++) {
            System.out.println("Аттракцион " + (i + 1) + ": ");
            System.out.print("Название: ");
            String name = inputData.next();
            System.out.print("Цена: ");
            int price = inputData.nextInt();
            System.out.print("Сколько минут работает: ");
            int minutesOfWork = inputData.nextInt();
            attractions[i] = new Park.Attraction(name, minutesOfWork, price);
            System.out.println("Аттракцион добавлен");
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
}