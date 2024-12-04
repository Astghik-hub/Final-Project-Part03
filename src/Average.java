import java.util.Scanner;

/**
 * This class will allow a user to enter 5 scores into an array.
 * It will then rearrange the data in descending order and calculate the mean for the data set.
 */
public class Average {
    // array which contains the scores
    private int[] data;
    // the arithmetic average of the scores
    private double mean;
    Scanner nums = new Scanner(System.in);

    /**
     * Constructor
     */
    public Average() {
        data = new int[5];
        for (int i = 0; i < data.length; i++) {
            System.out.printf("Enter score number %d: ", i + 1);
            data[i] = nums.nextInt();
        }
        calculateMean();
        selectionSort();
    }

    /**
     * method that calculates the mean (the arithmetic average of the scores)
     */
    public void calculateMean() {
        int total = 0;
        for (int val : data) {
            total += val;
        }
        mean = (double) total / data.length;
    }

    /**
     * The toString method
     *
     * @return data in descending order and the mean.
     */
    public String toString() {
        for (int val : data) {
            System.out.print(val + " ");
        }
        return String.format("%f", mean);
    }

    /**
     * method that rearranges the data set from highest to lowest.
     */
    public void selectionSort() {
        for (int i = 0; i < data.length; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[maxIdx]) {
                    maxIdx = j;
                }
            }
            int newNum = data[i];
            data[i] = data[maxIdx];
            data[maxIdx] = newNum;
        }
    }
}