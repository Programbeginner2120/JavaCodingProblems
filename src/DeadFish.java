import java.util.ArrayList;
public class DeadFish {

    public static int[] parse(String data) {
        int count = 0;
        ArrayList <Integer> intArray = new ArrayList<>();
        for (int i = 0; i < data.length(); i++){
            char ch = data.charAt(i);
            if (ch == 'i')
                count++;
            else if (ch == 'd')
                count--;
            else if(ch == 's')
                count = count * count;
            else if(ch == 'o')
                intArray.add(count);
        }
        return intArray.stream().mapToInt(Integer::intValue).toArray();
    }
}