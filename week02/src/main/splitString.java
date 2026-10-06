package main;

public class splitString {
        public static void main(String[] args) {
            String s = "Bangladesh is a beautiful country";
            String []a = s.split(" ");

            for(int i= 0; i < a.length; i++) {
                System.out.println(a[i]);
            }

}
}
