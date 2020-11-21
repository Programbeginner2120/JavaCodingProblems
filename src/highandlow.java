import java.io.IOException;
import java.util.ArrayList;

class Kata {

    public static String highAndLow(String numbers) throws IOException {

        ArrayList<Integer> myIntegerArray = new ArrayList<Integer>();

        boolean contRead = true;

        while (contRead) {

            if (numbers.length() > 0) {

                try {
                    myIntegerArray.add(Integer.parseInt(numbers.substring(0, numbers.indexOf(' '))));
                    numbers = numbers.substring(numbers.indexOf(' ') + 1);
                } catch (StringIndexOutOfBoundsException ex) {
                    myIntegerArray.add(Integer.parseInt(numbers));
                    numbers = "";
                    ex.getMessage();
                }

            } else
                contRead = false;
        }

        int maxNum = 0;
        int minNum = 0;

        for (Integer integer : myIntegerArray) {
            if (integer > maxNum)
                maxNum = integer;
            else if (integer < minNum)
                minNum = integer;
        }

        String myString = maxNum + " " + minNum;

        return myString;
    }
}

class highandlowcodewarschallenge {

    public static void main(String[] args) throws IOException {

        System.out.println(Kata.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));

    }
}
