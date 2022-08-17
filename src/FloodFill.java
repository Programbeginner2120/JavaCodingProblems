//URL: https://leetcode.com/problems/flood-fill/

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color){
            return image;
        }
        int [] above = new int [] {sr-1, sc};
        int [] below = new int [] {sr+1, sc};
        int [] left = new int [] {sr, sc-1};
        int [] right = new int [] {sr, sc+1};
        int curr = image[sr][sc];
        image[sr][sc] = color;
        if (above[0] >= 0 && image[above[0]][above[1]] == curr){
            image = this.floodFill(image, above[0], above[1], color);
        }
        if (below[0] < image.length && image[below[0]][below[1]] == curr){
            image = this.floodFill(image, below[0], below[1], color);
        }
        if (left[1] >= 0 && image[left[0]][left[1]] == curr){
            image = this.floodFill(image, left[0], left[1], color);
        }
        if (right[1] < image[0].length && image[right[0]][right[1]] == curr){
            image = this.floodFill(image, right[0], right[1], color);
        }
        return image;
    }
}