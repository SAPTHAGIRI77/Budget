import java.lang.*;
import java.util.*;

class stackex {
    public static void stackpush(Stack<Integer> s) {
        for (int i = 0; i < 5; i++) {
            s.push(i);
        }
    }

    public static int stackpop(Stack<Integer> s) {
        return s.pop();
    }

    public static int stacksearch(Stack<Integer> s, int a) {
        return s.search(a);
    }

    public static int stackTopElement(Stack<Integer> s) {
        return s.peek();
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        Stack<Integer> s1 = new Stack<>();
        System.out.println(s);
        stackpush(s);
        stackpush(s1);
        System.out.println(s1);
        System.out.println(s);
        System.out.println(stackpop(s));
        System.out.println("element at position:" + stacksearch(s, 3));
        System.out.println(s);
        System.out.println(stackTopElement(s1));
    }
}