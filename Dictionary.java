import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dictionary {

    public ArrayList<String> adjectivesList = new ArrayList<String>();
    public ArrayList<String> nounsList = new ArrayList<String>();

    /*
    Desc: Gets a random adjective.
    Precondition:
    Postcondition:
    */
    public String adjectives() throws FileNotFoundException {
        Scanner adFile = new Scanner(new File("Adjectives.txt"));

        while(adFile.hasNext()){
            adjectivesList.add(adFile.nextLine());
        }

        String[] adjectivesArray = adjectivesList.toArray(new String[50]);

        int index = new Random().nextInt(adjectivesArray.length);
        String randomAdjective = (adjectivesArray[index]);

        return randomAdjective;
    }

    /*
    Desc: Gets a random noun.
    Precondition:
    Postcondition:
    */
    public String nouns() throws FileNotFoundException {
        Scanner nounsFile = new Scanner(new File("Nouns.txt"));

        while(nounsFile.hasNext()){
            nounsList.add(nounsFile.nextLine());
        }

        String[] nounsArray = nounsList.toArray(new String[30]);
        int index2 = new Random().nextInt(nounsArray.length);
        String randomNoun = (nounsArray[index2]);

        return randomNoun;
    }
}
