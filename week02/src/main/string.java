package main;

public class string {
    public static void main(String[] args) {
        String s = "Hello, I am Farin!";
        String s2 = new String("I live in Bangladesh.");
        System.out.println(s + " " + s2);
        int l = s.length();
        System.out.println(l);
        System.out.println(s.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s2.charAt(7));

        if(s.equals(s2)) {
            System.out.println("They are equal");
        }
        else {
            System.out.println("Not equal");
        }

    }
}
