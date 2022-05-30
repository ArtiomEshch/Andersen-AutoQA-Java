package school.lesson_4;

public class Payment {

    static double totalPrice = 0;

    public void pay(Product... products) {
        System.out.println("Вы покупаете:");
        for (Product element : products) {
            System.out.println(element.toString());
        }
        System.out.println("К оплате: " + totalPrice);
    }

    public static class Product {
        String name;
        double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
            totalPrice += price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
