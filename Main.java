import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    Dictionary dictionary = new Dictionary();

    /**
     *output
     *public String output() throws FileNotFoundException
     *Desc: Creates the insult string.
     *Precondition: N/A
     *Postcondition: returns insult string
     *Throws: FileNotFoundException if file is not found.
     */
    public String outputRandom() throws FileNotFoundException {
        Dictionary dictionary = new Dictionary();

        String insult;
        int choiceInsult = ThreadLocalRandom.current().nextInt(0, 6 + 1);

        // Generate a random insult from cases
        switch(choiceInsult) {
            case 1:
                insult = outputSelf();
                break;
            case 2:
                insult = outputMama();
                break;
            case 3:
                insult = outputDad();
                break;
            default:
                insult = outputSelf();
                break;
        }

        return insult;

    }

    /**
     * Desc: Creates insult string for "yo mama"
     * @return insult
     * @throws FileNotFoundException if file is not found.
     */

    public String outputMama() throws FileNotFoundException {
        String  insult = ("Yo mama is a/an " + dictionary.verbs() + " " + dictionary.adjectives() + " " + dictionary.foods() + "!");

        return insult;
    }

    /**
     * Desc: Creates insult string for "yo dad"
     * @return insult
     * @throws FileNotFoundException if file is not found.
     */
    public String outputDad() throws FileNotFoundException{
        String insult = ("Yo dad is a/an " + dictionary.verbs() + " " + dictionary.adjectives() + " " + dictionary.foods() + "!");

        return insult;
    }

    /**
     * Desc: Creates insult string for yourself
     * @return insult
     * @throws FileNotFoundException if file is not found.
     */
    public String outputSelf() throws FileNotFoundException{
        String insult = ("You're a/an " + dictionary.verbs() + " " + dictionary.adjectives() + " " + dictionary.foods() + "!");

        return insult;
    }

    public void outputListOfFoods() throws FileNotFoundException {
        ArrayStack arrayStack = new ArrayStack();

        Scanner foodsFile = new Scanner(new File("Food.txt"));

        while(foodsFile.hasNext()){
            arrayStack.push(foodsFile.nextLine());
        }

        for(int i = 0; i <= arrayStack.size()+1; i++){
            System.out.println(arrayStack.pop());
        }

    }

}