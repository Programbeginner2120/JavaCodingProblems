import java.util.Arrays;
import java.util.stream.Collectors;

class FurthestBuildingReached {
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        if (bricks == 0 && ladders == 0){
            int finalIndex = Arrays.stream(heights).boxed().collect(Collectors.toList()).lastIndexOf(-1);
            if (finalIndex == -1)
                return 0;
            return finalIndex;
        }
        else if (heights[heights.length - 2] == -1)
            return heights.length - 1;

        int currIndex = Arrays.stream(heights).boxed().collect(Collectors.toList()).lastIndexOf(-1) + 1;
        if (heights[currIndex] >= heights[currIndex + 1]){
            heights[currIndex] = -1;
            return furthestBuilding(heights, bricks, ladders);
        }
        else {
            int usingBricks = 0;
            if (heights[currIndex + 1] - heights[currIndex] <= bricks){
                heights[currIndex] = -1;
                usingBricks = furthestBuilding(heights, bricks - (heights[currIndex + 1] - heights[currIndex]), ladders);
            }
            int usingLadders = 0;
            if (ladders - 1 >= 0){
                heights[currIndex] = -1;
                usingLadders = furthestBuilding(heights, bricks, ladders - 1);
            }
            return Math.max(usingBricks, usingLadders);
        }
    }

    public static void main(String [] args){
         int furthestBuildingIndex = furthestBuilding(new int[]{4, 2, 7, 6, 9, 14, 12}, 5, 1);
        System.out.println(furthestBuildingIndex);
//        Integer arr [] = new Integer[]{-1,2,7,6};
//        System.out.println(Arrays.asList(arr).lastIndexOf(-1) + 1);
    }
}

//TODO: COME BACK TO THIS PROBLEM

