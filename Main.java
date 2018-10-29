import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Dictionary dictionary = new Dictionary();

        System.out.println("You are a/n " + dictionary.adjectives() + " " + dictionary.nouns() + "!");
    }
}
