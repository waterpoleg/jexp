package collections.task04;

import java.util.*;

public class TreeSetExamples {
    public static void main(String[] args) {

        Set<User> users = new TreeSet<>(new ComparatorUserByAge()
                //.thenComparing(Comparator.naturalOrder())
                .thenComparing(new ComparatorUserByName())
                .thenComparing(new ComparatorUserByHeight()));

        User user1 = new User(20, "Fedor", 168, 100);
        User user3 = new User(28, "Luther", 170, 85);
        User user5 = new User(33, "Ragnar", 165, 77);
        User user7 = new User(33, "Lars", 175, 105);
        User user6 = new User(38, "Sheppard", 172, 93);
        User user4 = new User(42, "King", 177, 68);
        User user2 = new User(55, "Martin", 185, 120);
        User user8 = new User(55, "Bred", 185, 98);
        User user9 = new User(55, "Bred", 186, 88);
        User user10 = new User(55, "Bred", 185, 85);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);

        System.out.println(users);
    }
}
