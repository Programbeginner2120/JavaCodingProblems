public class BouncingBalls {

    public static int bouncingBall(double h, double bounce, double window) {
        if (window >= h || h < 0 || 0 >= bounce || bounce >= 1)
            return -1;
        int numTimes = 0;
        while(h > window){
            numTimes++;
            h *= bounce;
            if (h > window)
                numTimes++;
        }
        return numTimes;
    }

}