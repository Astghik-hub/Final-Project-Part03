import java.util.Scanner;
import java.io.*;

/**
 * This program creates a list of songs for a CD
 * by reading from a file.
 */
public class CompactDisc {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("Classics.txt"));
        String title;
        String artist;
        Song[] cd = new Song[6];
        for (int i = 0; i < cd.length; i++) {
            title = input.nextLine();
            artist = input.nextLine();
            cd[i] = new Song(title, artist);
        }
        System.out.println("Contents of Classics:");
        for (int i = 0; i < cd.length; i++) {
// ADD LINES FOR TASK #3 HERE
// Print the contents of the array to the console
            System.out.println(cd[i] + "\n");
        }
    }
}
