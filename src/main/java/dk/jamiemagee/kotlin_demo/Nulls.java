package dk.jamiemagee.kotlin_demo;

public class Nulls {

    public static void main(String args[]) {

        String myString = "A value";

        // myString is reassigned
        myString = null;


        // Uh oh
        myString.equals("Another value");

        // Chaining nulls in Java
        chainingNulls();

    }

    private static Integer chainingNulls() {
        String b = "Other string";

        if (b != null) {
            if (Double.valueOf(b) != null) {
                return Double.valueOf(b).compareTo(1.0);
            }
        }

        return null;
    }
}
