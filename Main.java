import java.io.FileNotFoundException;

public class Main {

    /*
    Desc: Creates the insult string.
    Precondition:
    Postcondition: returns insult string
    Throws: FileNotFoundException if file is not found.
     */
    public String output() throws FileNotFoundException {
        Dictionary dictionary = new Dictionary();

        String insult = ("You are a/n " + dictionary.adjectives() + " " + dictionary.nouns() + "!");

        return insult;

    }
}
