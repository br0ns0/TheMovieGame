import java.util.Scanner;
import java.io.File;

public class WordCount {

    public static void main (String[] args) throws Exception{ //throw Exception in case file is empty to prevent error
        File book = new File("Frankenstien.txt");
        Scanner scan = new Scanner(book);

        int totalWords = 0;
        while (scan.hasNextLine()){ //to read all lines in file we use while loop
            String line = scan.nextLine(); // stores the value of each nextLine as String
                totalWords += line.split(" ").length; // split() breaks string around matches ie(" ") of the expression.
            // add total words to the number of words in each line until all lines are read
        }
        System.out.println(totalWords);


    }
}
