package algos;

import java.util.Deque;
import java.util.LinkedList;

public class Brackets {

    public static boolean pairedBrackets(String brackets) {
        int count = 0;
        if (brackets.isEmpty()) {
            return false;
        }
        for (char ch : brackets.toCharArray()) {
            if (ch == '(') {
                count++;
            } else {
                if (ch == ')') {
                    count--;
                }
            }
        }
        return count == 0;
    }

    public static boolean pairedBrackets2(String brackets) {
        Deque<Character> deque = new LinkedList<>();
        if (brackets.isEmpty()) {
            return false;
        }
        for (char ch : brackets.toCharArray()) {
            if (ch == '(') {
                deque.addFirst(ch);
            } else {
                if (!deque.isEmpty() && (deque.peekFirst() == '(' && ch == ')')) {
                    deque.removeFirst();
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(pairedBrackets("((()))")); // true
        System.out.println(pairedBrackets2("((()))")); // true
        System.out.println(pairedBrackets("((())))")); // false
        System.out.println(pairedBrackets2("((())))")); // false
    }
}
