package level3;
import java.util.Arrays;

public class Ftha_m3 {
    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11);
        System.out.println("Player Heights: " + Arrays.toString(heights));

        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);

        System.out.println("Sum of Heights: " + sum);
        System.out.println("Mean Height: " + mean);
        System.out.println("Shortest Player Height: " + shortest);
        System.out.println("Tallest Player Height: " + tallest);
    }

    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int) (Math.random() * 101);
        }
        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortestHeight(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            min = Math.min(min, height);
        }
        return min;
    }

    public static int findTallestHeight(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            max = Math.max(max, height);
        }
        return max;
    }
}
