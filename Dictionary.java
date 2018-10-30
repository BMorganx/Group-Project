import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dictionary {

    public ArrayList<String> adjectivesList = new ArrayList<String>();
    public ArrayList<String> nounsList = new ArrayList<String>();
    public ArrayList<String> verbsList = new ArrayList<String>();


    /*
    Desc: Gets a random adjective.
    Precondition: Adjectives.txt exists.
    Postcondition: returns a random element from the adjectivesArray
    Throws: FileNotFoundException if the file Adjectives.txt is not found.
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
    
      /**
     * verbs
     * public String verbs() throws FileNotFoundException
     * Desc: Get a random verb for insult sentence
     * Precondition: Verbs.txt exists.
     * Postcondition: returns a random element from the verbsArray.
     * Throws: FileNotFoundException if the file Verbs.txt is not found.
     */
    public String verbs() throws FileNotFoundException {
    	Scanner verFile = new Scanner(new File("Verbs.txt"));
    	
    	while(verFile.hasNext()) {
    		verbsList.add(verFile.nextLine());
    	}
        
    	String[] verbsArray = verbsList.toArray(new String[50]);
        
    	int index = new Random().nextInt(verbsArray.length);
    	String randomVerb = (verbsArray[index]);
    	
    	return randomVerb;
    }


    /*
    Desc: Gets a random noun.
    Precondition: Nouns.txt exists.
    Postcondition: returns a random element from the nounsArray
    Throws: FileNotFoundException if the file Nouns.txt is not found.
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
