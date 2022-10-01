package Recursion.Stack;

public class Greets {
    public static void greet(String name) {
        System.out.println("hello " + name);
        greet2(name);
        System.out.println("Getting ready to say bye");
        bye(name);
    }

    public static String bye(String name) {
        return "bye, " + name;
    }

    public static void greet2(String name) {
        System.out.println("how are you, " + name);
    }
}
