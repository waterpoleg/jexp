package collections.task03;

import java.util.HashMap;
import java.util.Set;

public class Task03 {

    public static void upProductCountBy10(HashMap<Integer, Product> products, Set<Integer> keys) {
        int addCount = 10;
        for (int key : keys) {
            Product product = products.get(key);
            product.setCount(product.getCount() + addCount);
        }
    }

    public static void main(String[] args) {
        HashMap<Integer, Product> products = new HashMap<>();
        products.put(1, new Product(2, "name1", "manufacturer1"));
        products.put(2, new Product(55, "name2", "manufacturer2"));
        products.put(3, new Product(3, "nam3", "manufacturer3"));
        products.put(4, new Product(4, "name4", "manufacturer4"));
        products.put(5, new Product(1, "name5", "manufacturer5"));
        products.put(6, new Product(70, "name6", "manufacturer6"));
        products.put(7, new Product(5, "name7", "manufacturer7"));
        products.put(8, new Product(90, "name8", "manufacturer8"));
        products.put(9, new Product(10, "name9", "manufacturer9"));

        // 1 - print all products with count > 5
        for (int key : products.keySet()) {
            if (products.get(key).getCount() > 5) {
                System.out.println(key);
            }
        }

        System.out.println(" --- ");

        // 2 - increase count by 10
        upProductCountBy10(products, Set.of(1, 2, 5, 7));
        for (Product item : products.values()) {
            System.out.println(item.getCount());
        }
    }
}
