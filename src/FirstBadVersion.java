//URL: https://leetcode.com/problems/first-bad-version/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int midpoint;
        boolean isBadVersion;
        while (start < end){
            midpoint = (int) ((start/2.0) + (end/2.0));
            isBadVersion = super.isBadVersion(midpoint);
            if (isBadVersion){
                end = midpoint;
            }
            else if (!isBadVersion){
                start = midpoint + 1;
            }
        }
        return start;
    }
}