package collections.task04;

import java.util.Comparator;

public class ComparatorUserByHeight implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        int result = Float.compare(o1.getHeight(), o2.getHeight());
        return result == 0 ? 1 : result;
    }
}
