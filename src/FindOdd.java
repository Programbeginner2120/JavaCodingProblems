public class FindOdd {
    public static int findIt(int[] a) {
        int count;
        int currentNumber;
        for (int i = 0; i < a.length; i++){
            count = 1;
            currentNumber = a[i];
            int j = (i + 1) % a.length;
            while (j != i){
                if (a[j] == currentNumber)
                    count++;
                j = (j + 1) % a.length;
            }
            if (count % 2 != 0)
                return currentNumber;
        }
        return -1;
    }
}