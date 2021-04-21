package homework8.task3;

import homework8.task2.Worker;

import java.util.Arrays;
import java.util.Scanner;

public class Price {
    String shop;
    String nameOfProduct;
    int price;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name of the first shop, product and prise: ");
        Price shop1 = new Price(in.next(), in.next(), in.nextInt());
        System.out.println("Enter name of the second shop, product and prise: ");
        Price shop2 = new Price(in.next(), in.next(), in.nextInt());
        Price[] shops = {shop1, shop2};
        //Arrays.sort(products);

        System.out.println("Enter the shop: ");
        String newNameShop = in.next();

        for (Price temp: shops) {
            if (newNameShop.equals(temp.getShop())) {
                System.out.println("Product: " + temp.getNameOfProduct() + " Price: " + temp.getPrice());
            }
        }
    }
    public Price(String shop, String nameOfProduct, int price) {
        this.shop = shop;
        this.nameOfProduct = nameOfProduct;
        this.price = price;
    }
    public String getNameOfProduct() {
        return nameOfProduct;
    }
    public String getShop() {
        return shop;
    }
    public int getPrice() {
        return price;
    }
}

