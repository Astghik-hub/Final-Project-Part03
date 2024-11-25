import java.util.Scanner;

public class Average {
    /**
     * This class will allow a user to enter 5 scores into an array.
     * It will then rearrange the data in descending order and calculate the mean for the data set.
     */
    // array which contains the scores
    private int[] data;
    // the arithmetic average of the scores
    private double mean;
    Scanner nums = new Scanner(System.in);

    /**
     * Constructor
     *
     * @param
     */
    public Average() {

        for (int i = 0; i < data.length; i++) {
            System.out.printf("Enter score number %d: ", i + 1);
            data[i] = nums.nextInt();
        }
        calculateMean();
        selectionSort();
    }

    public void calculateMean() {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        mean = (double) total / data.length;
    }

    public String toString() {
        return String.format("HELP");
    }

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