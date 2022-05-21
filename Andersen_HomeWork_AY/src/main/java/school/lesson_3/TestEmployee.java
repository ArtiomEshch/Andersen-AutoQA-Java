package school.lesson_3;

public class TestEmployee {

    public static void main(String[] args) {
        Employee[] EmpArray = new Employee[5];

        EmpArray[0] = new Employee("Сергей", "Симонов", "Владимирович",
                "Software Developer", "SVS@andersen.network", "80291554456",
                3000, 29);
        EmpArray[1] = new Employee("Александр", "Волож", "Семеновч",
                "Legal Counsel", "ASV@andersen.network", "80332151314",
                2000, 42);
        EmpArray[2] = new Employee("Анатолий", "Гуров", "Владимирович",
                "CEO", "CEO@andersen.network", "80447156457",
                9000, 45);
        EmpArray[3] = new Employee("Юлия", "Бокская", "Сергеевна",
                "Office Manager", "YSB@andersen.network", "80256754898",
                800, 25);
        EmpArray[4] = new Employee("Константин", "Шун", "Евгеньевич",
                "Junior AQA", "KES@andersen.network", "80291698584",
                500, 19);

        for (Employee element : EmpArray) {
            if (element.getAge() > 40) Employee.getInfo(element);
        }
    }
}
