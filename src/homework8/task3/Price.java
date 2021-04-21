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
        Price[] products = {shop1, shop2};
        //Arrays.sort(products);

        System.out.println("Enter the shop: ");
        String newNameShop = in.next();
        Exception ex = new Exception("There is no such shop");
        if (newNameShop.equals(shop1.getShop())) {
            System.out.println("Product: " + shop1.getNameOfProduct() + " Price: " + shop1.getPrice());
        } if (newNameShop.equals(shop2.getShop())) {
            System.out.println("Product: " + shop2.getNameOfProduct() + " Price: " + shop2.getPrice());
        } else {
                try {
                    throw ex;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
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

