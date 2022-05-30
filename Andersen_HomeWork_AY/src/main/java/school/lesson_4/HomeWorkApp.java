package school.lesson_4;

import school.lesson_4.animals.Cat;
import school.lesson_4.animals.Dog;
import school.lesson_4.animals.Plate;

import static school.lesson_4.animals.Cat.catNumber;
import static school.lesson_4.animals.Dog.dogNumber;
import static school.lesson_4.animals.Animal.animalsNumber;

public class HomeWorkApp {
    public static void main(String[] args) {

        // Тест методов Cat и Dog

        Dog buz = new Dog("Buz");
        Cat ruz = new Cat("Ruz");

        buz.run(300);
        ruz.run(299);
        buz.swim(10);
        ruz.swim(11);

        // Тест задания с тарелкой

        Cat[] arrayCat = new Cat[5];

        arrayCat[0] = new Cat("Cat One", 2);
        arrayCat[1] = new Cat("Cat Two", 1);
        arrayCat[2] = new Cat("Cat Three", 3);
        arrayCat[3] = new Cat("Cat Four", 8);
        arrayCat[4] = new Cat("Cat Five", 5);

        Plate plate = new Plate(10);

        for (Cat element : arrayCat) { // информация о сытости выводится в методе eat
            element.eat(plate);
        }
        System.out.println(plate.getMeal() + " еды осталось в тарелке");

        for (Cat element : arrayCat) { // можно вывести значение поля сытости
            System.out.println(element.isSatiety());
        }

        System.out.println(catNumber + " котов создано");
        System.out.println(dogNumber + " собак создано");
        System.out.println(animalsNumber + " животных создано");

        // Тест парка
        Park park = new Park(3);
        park.addAttraction("Карусель", 3, 15); // создание аттракционов
        park.addAttraction("Качели", 2, 10);
        park.addAttraction("Ракушки", 2, 5);
        park.addAttraction("Лодочки", 1, 10); // не достаточно места
        park.getInfo(); // получение информации о парке

        // Тест оплаты
        Payment payment = new Payment();
        Payment.Product productOne = new Payment.Product("Сыр", 15);
        Payment.Product productTwo = new Payment.Product("Молоко", 10);
        payment.pay(productOne, productTwo);
    }
}
