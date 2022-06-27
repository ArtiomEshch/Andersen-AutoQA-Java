package school.lesson_7;

import java.io.*;
import static school.lesson_7.AppData.generateData;

public class HomeWorkApp {
    public static void main(String[] args) throws IOException {

        String[] firstTestString = {"Value 1", "Value 2", "Value 3"};
        String[] secondTestString = {"Value 3", "Value 2", "Value 1"};

        int[][] firstTestArray = {{100, 200, 300}, {400, 500, 600}};
        int[][] secondTestArray = {{600, 500, 400}, {300, 200, 100}};

        AppData firstTest = new AppData(firstTestString, firstTestArray);
        // создаем тестовые данные для первой записи
        AppData seconfTest = new AppData(secondTestString, secondTestArray);
        // создаем тестовые данные для перезаписи

        BufferedWriter csvWriter = new BufferedWriter(new FileWriter("HW.csv")); // открываем поток записи
        csvWriter.write(generateData(firstTest));
        csvWriter.close(); // закрываем поток

        String stringTast1;
        BufferedReader csvReader = new BufferedReader(new FileReader("HW.csv")); // открываем поток чтения
        while ((stringTast1 = csvReader.readLine()) != null) {
            System.out.println(stringTast1);
        }
        csvReader.close(); // закрываем поток

        // Тест метода save
        AppData.save(seconfTest);
        String stringTast2;
        BufferedReader reader = new BufferedReader(new FileReader("HW.csv")); // открываем поток чтения
        while ((stringTast2 = reader.readLine()) != null) {
            System.out.println(stringTast2);
        }
        reader.close(); // закрываем поток
    }
}
