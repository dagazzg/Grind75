package java;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        return fill(image, sr, sc, color, image[sr][sc]);
    }

    private int[][] fill(int[][] image, int sr, int sc, int newColor, int startingColor) {
        if (sr < 0  || sr >= image.length || sc < 0 || sc >= image[sr].length || image[sr][sc] == newColor) return image;
        int originalColor = image[sr][sc];
        if(originalColor == startingColor) {
            image[sr][sc] = newColor;
            fill(image, sr - 1, sc, newColor, originalColor);
            fill(image, sr + 1, sc, newColor, originalColor);
            fill(image, sr, sc - 1, newColor, originalColor);
            fill(image, sr, sc + 1, newColor, originalColor);
        }
        return image;
    }
}
