// https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java

public class WhoLikesIt {
    public static String whoLikesIt(String... names) {

        // Just a bunch of if statements with formatted strings

        if (names.length == 0)
            return "no one likes this";

        if (names.length == 1)
            return names[0] + " likes this";

        if (names.length == 2)
            return names[0] + " and " + names[1] + " like this";

        if (names.length == 3)
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";

        else
            return names[0] + ", " + names[1] + " and " + Integer.toString(names.length - 2) + " others like this";

    }


    public static void main(String[] args) {
        System.out.println(WhoLikesIt.whoLikesIt()); // "no one likes this"
        System.out.println(WhoLikesIt.whoLikesIt("Peter"));  // "Peter likes this"
        System.out.println(WhoLikesIt.whoLikesIt("Jacob", "Alex")); // "Jacob and Alex like this"
        System.out.println(WhoLikesIt.whoLikesIt("Max", "John", "Mark")); // "Max, John and Mark like this"
        System.out.println(WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max")); // "Alex, Jacob and 2 others like this"
    }
}
