package school.lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class Payment {

    private int numberProducts;
    private Product[] products;
    private int totalPrice;

    private class Product {
        private String productName;
        private int productPrice;

        public Product(String productName, int productPrice) {
            super();
            this.productName = productName;
            this.productPrice = productPrice;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public double getProductPrice() {
            return productPrice;
        }

        public void setProductPrice(int productPrice) {
            this.productPrice = productPrice;
        }
    }

    public Payment(int numberProducts) {
        this.numberProducts = numberProducts;
        this.products = new Product[numberProducts];
        Scanner inputData = new Scanner(System.in);
        for (int i = 0; i < products.length; i++) {
            System.out.println("Товар " + (i + 1) + ": ");
            System.out.print("Наименование: ");
            String name = inputData.next();
            System.out.print("Цена: ");
            int price = inputData.nextInt();
            products[i] = new Product(name, price);
            this.totalPrice += products[i].productPrice;
        }
    }

    public void printCheque() {
        System.out.println("============================");
        System.out.println("============ЧЕК=============");
        System.out.println("============================");

        for (int i = 0; i < this.products.length; i++) {
            System.out.printf("%3d", i + 1);
            System.out.printf("%15s",
                    this.products[i].productName);
            System.out.printf("%10d",
                    this.products[i].productPrice);
            System.out.println();
        }
        System.out.println("============================");
        System.out.print("Общая стоимость: ");
        System.out.printf("%11d", this.totalPrice);
        System.out.println();
        System.out.println("============================");
    }

    public int getNumberProducts() {
        return numberProducts;
    }

    public void setNumberProducts(int numberProducts) {
        this.numberProducts = numberProducts;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payment payment = (Payment) o;

        if (numberProducts != payment.numberProducts) return false;
        if (totalPrice != payment.totalPrice) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(products, payment.products);
    }

    @Override
    public int hashCode() {
        int result = numberProducts;
        result = 31 * result + Arrays.hashCode(products);
        result = 31 * result + totalPrice;
        return result;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "numberProducts=" + numberProducts +
                ", products=" + Arrays.toString(products) +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
