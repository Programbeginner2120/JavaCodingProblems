public class SumDigits {

    public static int digital_root(int n) {

        String stringNum = Integer.toString(n);
        if (stringNum.length() == 1)
            return n;

        int sum = 0;
        for (int i = 0; i < stringNum.length(); i++)
            sum += Character.getNumericValue(stringNum.charAt(i));
        return digital_root(sum);

    }
}