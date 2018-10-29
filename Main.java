import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner adFile = new Scanner(new File("Adjectives.txt"));
        ArrayList<String> adjectivesList = new ArrayList<String>();

        while(adFile.hasNext()){
            adjectivesList.add(adFile.nextLine());
        }

        String[] adjectivesArray = adjectivesList.toArray(new String[50]);

        /*
        Desc: Gets a random adjective.
        Precondition:
        Postcondition:
         */
        int index = new Random().nextInt(adjectivesArray.length);
        String randomAdjective = (adjectivesArray[index]);

        /*
        Desc: Gets a random noun.
        Precondition:
        Postcondition:
         */
        Scanner nounsFile = new Scanner(new File("Nouns.txt"));
        ArrayList<String> nounsList = new ArrayList<String>();

        while(nounsFile.hasNext()){
            nounsList.add(nounsFile.nextLine());
        }

        String[] nounsArray = nounsList.toArray(new String[30]);
        int index2 = new Random().nextInt(nounsArray.length);
        String randomNoun = (nounsArray[index2]);

        System.out.println("You are a/n " + randomAdjective + " " + randomNoun + "!");
    }
}
