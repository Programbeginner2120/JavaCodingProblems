// URL: https://leetcode.com/problems/plus-one/submissions/

public class PlusOne {

    public int[] plusOne(int[] digits) {
        boolean needNewArr = true;
        for (int i = digits.length - 1; i >= 0; i--){
            if (digits[i] < 9){
                digits[i] += 1;
                needNewArr = false;
                break;
            }
            else
                digits[i] = 0;
        }

        if (needNewArr){
            int [] newArr = new int[digits.length + 1];
            newArr[0] = 1;
            for (int i = 1; i < newArr.length; i++)
                newArr[i] = 0;
            return newArr;
        }
        return digits;
    }

}
