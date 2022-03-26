package collections.task04;

import java.util.*;
import java.util.function.Predicate;

public class TreeSetLambdaExamples {
    public static void main(String[] args) {

        //Set<User> users = new TreeSet<>((o1, o2) -> o1.getAge() - o2.getAge());
        //Set<User> users = new TreeSet<>(Comparator.comparing(User::getAge));

        /*Set<User> users = new TreeSet<>((o1, o2) -> {
            int compareByAge = o1.getAge() - o2.getAge();
            int compareByName = o1.getName().compareTo(o2.getName());
            int compareByHeight = Float.compare(o1.getHeight(), o2.getHeight());
            compareByHeight = compareByHeight == 0 ? 1 : compareByHeight;
            return compareByAge + compareByName + compareByHeight;
        });*/

        Set<User> users = new TreeSet<>(Comparator.comparing(User::getAge)
                .thenComparing(Comparator.comparing(User::getName))
                .thenComparing((user1, user2) -> {
                    int compareByHeight = Float.compare(user1.getHeight(), user2.getHeight());
                    return compareByHeight == 0 ? 1 : compareByHeight;
                }));

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

        System.out.println("\nup age by 10:");
        users.forEach(user -> user.setAge(user.getAge() + 10));
        System.out.println(users);

        List<User> usersList = new ArrayList<>(users.stream().toList());
        System.out.println("\nusersList:");
        System.out.println(usersList);

        Predicate<String> filter = name -> name.toLowerCase().contains("k");
        //usersList.removeIf(user -> user.getName().toLowerCase().contains("k"));
        usersList.removeIf(user -> filter.test(user.getName()));
        System.out.println("\nusersList w/o k:");
        System.out.println(usersList);
    }
}
