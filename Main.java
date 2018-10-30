import java.io.FileNotFoundException;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    /**
    Desc: Creates the insult string.
    Precondition:
    Postcondition: returns insult string
    Throws: FileNotFoundException if file is not found.
     */
    public String output() throws FileNotFoundException {
        Dictionary dictionary = new Dictionary();

        String insult;
        int choiceInsult = ThreadLocalRandom.current().nextInt(0, 6 + 1);
       
        // Generate a random insult from cases
        switch(choiceInsult) {
	        case 1:
	        	insult = ("You are a/n " + dictionary.adjectives() + " " + dictionary.nouns() + "!");
	        	break;
	        case 2:
	        	insult = ("Your mom is a/an" + dictionary.adjectives() + " " + dictionary.nouns() + "!");
	        	break;
	        case 3:
	        	insult = ("Your dad is a/an" + dictionary.adjectives() + " " + dictionary.nouns() + "!");
	        	break;
	        case 4:
	        	insult = ("Your sister is a/an" + dictionary.adjectives() + " " + dictionary.nouns() + "!");
	        	break;
	        case 5:
	        	insult = ("Your computer is " + dictionary.adjectives() + " " + "!");
	        	break;
	        case 6:
	        	insult = ("Your house is " + dictionary.adjectives() + " " + "!");
	        	break;
	        default:
	        	insult = ("You are a/an" + dictionary.adjectives() + " " + dictionary.nouns() + "!");
			break;
        }
        
        return insult;

    }
}
