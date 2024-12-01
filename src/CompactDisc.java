import java.io.IOException;
import java.util.Scanner;
import java.io.File;

/**
 * This program creates a list of songs for a CD
 * by reading from a file.
 */
public class CompactDisc {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("src/Classics.txt"));
        String title;
        String artist;
        Song[] cd = new Song[6];
        for (int i = 0; i < cd.length; i++) {
            title = input.nextLine();
            artist = input.nextLine();
            cd[i] = new Song(title, artist);
        }
        input.close();
        System.out.println("Contents of Classics:");
        for (Song song : cd) {
            System.out.println(song);
        }
    }
}

