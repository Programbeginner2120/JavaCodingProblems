// https://www.codewars.com/kata/5f0ed36164f2bc00283aed07/train/java

public class Over_the_road {
    public static long overTheRoad(long address, long n) {
        return 2*n - (address - 1); // Pattern that houses follow
    }

    public static void main (String [] args){
        System.out.println(overTheRoad(1, 3)); // Should return 6
        System.out.println(overTheRoad(3, 3)); // Should return 4
        System.out.println(overTheRoad(2, 3)); // Should return 5
        System.out.println(overTheRoad(3, 5)); // Should return 8
        System.out.println(overTheRoad(7, 11)); // Should return 16
    }
}

