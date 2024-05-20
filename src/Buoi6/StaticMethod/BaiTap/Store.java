package Buoi6.StaticMethod.BaiTap;

import java.util.*;

public class Store {
    public void add(List<Product> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = sc.nextLine();
        System.out.print("Input price: ");
        long price = sc.nextLong();
        System.out.print("Input the number of product: ");
        int theNumberOfProduct = sc.nextInt();

        Product p = new Product(name, price, theNumberOfProduct);
        list.add(p);
    }

    public void display(List<Product> list) {
        for (Product p : list) {
            System.out.println(p);
        }

    }

    public long findPriceProduct(List<Product> list, String namePhone) {
        for (Product p : list) {
            if (p.getName().equalsIgnoreCase(namePhone)) {
                return p.getPrice();
            }
        }
        return 0;
    }

    public void remove(List<Product> list, int i) {
        for (int j = 0; j < list.size(); j++) {
            if (j == i) {
                list.remove(j);
                break;
            }
        }
    }

    public void remove(List<Product> list, String name) {
        for (Product p : list) {
            if (compare(p.getName(), name)) {
                list.remove(p);
                break;
            }
        }
    }

    public boolean compare(String product, String name) {
        return (product).equalsIgnoreCase(name);
    }

    public void edit(List<Product> list, int i) {
        for (int j = 0; j < list.size(); j++) {
            if (j == i) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Input name: ");
                String name = sc.nextLine();
                System.out.print("Input price: ");
                long price = sc.nextLong();
                System.out.print("Input the number of product: ");
                int theNumberOfProduct = sc.nextInt();
                list.get(j).setName(name);
                list.get(j).setPrice(price);
                list.get(j).setTheNumberOfProducts(theNumberOfProduct);
            }
        }
    }

    public void sortPriceHighToLow(List<Product> list) {
        Product a;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getPrice() > list.get(i).getPrice()) {
                    a = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, a);
                }
            }
        }
    }

    public void sortPriceLowToHigh(List<Product> list) {
        Product a;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getPrice() < list.get(i).getPrice()) {
                    a = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, a);
                }
            }
        }
    }

    public void displayAllP(List<Product> list) {
        for (Product p : list) {
            System.out.println(p);
        }
    }

    public long calculateTotalPrice(List<Product> list) {
        long totalPrice = 0;
        for (Product p : list) {
            totalPrice += p.getPrice() * p.getTheNumberOfProducts();
        }
        return totalPrice;
    }
}


