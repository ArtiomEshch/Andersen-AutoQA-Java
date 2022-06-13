package school.lesson_8;

import java.util.*;

public class HomeWorkApp {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Минск", "Барановичи", "Гродно", "Брест", "Минск", "Витебск",
                "Гомель", "Брест", "Пинск", "Гродно", "Минск", "Могилев", "Гродно", "Гомель");
        System.out.println("Список городов:");

        System.out.println("\nИтого:");
        Map<String, Integer> citiesCount = new HashMap<>();
        for (String element : cities) {
            citiesCount.put(element, citiesCount.getOrDefault(element, 0) + 1);
        } // кладу в map ключ s и значение.
        // Если ключа не будет он вернет значение по умолчанию, т.е. 0 и прибавит 1.
        // Но если ключ есть, он вернет значение, которое ему соответствует и прибавит к нему 1.

        citiesCount.forEach((key, value) ->
                System.out.println("Город " + key + " упоминается " + value + " раз"));

        // Задание со справочником:

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ещенко", "+375291454345");
        phoneBook.add("Смирнов", "+375294949404");
        phoneBook.add("Гончар", "+37529574395");
        phoneBook.add("Кислый", "+37529589564");
        phoneBook.add("Ещенко", "+375252554567");
        phoneBook.add("Иванов", "+375294345678");
        phoneBook.add("Волэский", "+375295748385");
        phoneBook.add("Иванов", "+375255568789");
        phoneBook.add("Смирнов", "+375256758395");

        System.out.println(phoneBook.get("Ещенко"));
        System.out.println(phoneBook.get("Иванов"));
        System.out.println(phoneBook.get("Смирнов"));
        System.out.println(phoneBook.get("Волэский"));
    }
}
