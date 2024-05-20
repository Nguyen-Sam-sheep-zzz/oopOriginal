package Buoi6.StaticMethod.BaiTap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        System.out.println("Your store ");
        System.out.println("Choice 0 to exit");
        System.out.println("Choice 1 to add ");
        System.out.println("Choice 2 to display ");
        System.out.println("Choice 3 to remove index ");
        System.out.println("Choice 4 to edit ");
        System.out.println("Choice 5 to remove name ");
        System.out.println("Choice 6 to find price with input name");
        System.out.println("Choice 7 to High price to low price ");
        System.out.println("Choice 8 to Low price to high price ");
        System.out.println("Choice 9 all price store");
        list.add(new Product("Iphone", 12000000, 6));
        while (true) {
            int choice = 0;
            int index = 0;
            System.out.println("Input ur choice");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    store.add(list);
                    break;
                case 2:
                    store.display(list);
                    break;
                case 3:
                    System.out.println("input remove index:  ");
                    index = sc.nextInt();
                    store.remove(list, index);
                    break;
                case 4:
                    System.out.println("input edit index: ");
                    index = sc.nextInt();
                    store.edit(list, index - 1);
                    break;
                case 5:
                    System.out.println("input remove name");
                    String name;
                    name = sc.next();
                    store.remove(list, name);
                    break;
                case 6:
                    System.out.println("Find product with input name: ");
                    String name2 = sc.next();
                    System.out.println("Price: " + name2 + " " + store.findPriceProduct(list, name2));
                    break;
                case 7:
                    System.out.println("High to low: ");
                    store.sortPriceHighToLow(list);
                    store.displayAllP(list);
                    break;
                case 8:
                    System.out.println("Low to high: ");
                    store.sortPriceLowToHigh(list);
                    store.displayAllP(list);
                    break;
                case 9:
                    System.out.println("All price store");
                    System.out.println(store.calculateTotalPrice(list));
            }
        }
    }
}
