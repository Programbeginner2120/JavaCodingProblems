// https://www.codewars.com/kata/555615a77ebc7c2c8a0000b8/train/java

import java.util.ArrayList;


public class Line {

    /*
    This method takes in as a parameter int [] which contains int
    values of 25, 50, 100. The method returns "YES" if all the transactions
    can be processed, "NO" if otherwise.
    @param int [] peopleInLine, representing bill types of 25, 50, 100
    @throws IndexOutOfBoundsException
    @return "YES" or "NO" depending on if all of the transactions can be
    processed
     */
    public static String Tickets(int[] peopleInLine) {

        ArrayList<Integer> billType = new ArrayList<>();

        for (int i = 0; i < peopleInLine.length; i++) {
            billType.add(peopleInLine[i]);
            try {
                if (peopleInLine[i] == 100) {
                    if (billType.contains(50)) {
                        billType.remove(billType.indexOf(50));
                        billType.remove(billType.indexOf(25));
                    } else {
                        for (int k = 0; k < 3; k++)
                            billType.remove(billType.indexOf(25));
                    }
                } else if (peopleInLine[i] == 50)
                    billType.remove(billType.indexOf(25));
            } catch (IndexOutOfBoundsException ex) {
                return "NO";
            }
        }
        return "YES";
    }
}