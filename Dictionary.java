import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dictionary {

    public ArrayList<String> adjectivesList = new ArrayList<String>();
    public ArrayList<String> foodsList = new ArrayList<String>();
    public ArrayList<String> fruitsList = new ArrayList<>();
    public ArrayList<String> vegetablesList = new ArrayList<>();
    public ArrayList<String> verbsList = new ArrayList<>();

    /**
     * Desc: Gets a random adjective from adjective.txt
     * Precondition: Adjectives.txt exists.
     * @return randomAdjective
     * @throws FileNotFoundException if the file Adjectives.txt is not found.
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
     * Desc: Gets a random verb from Verbs.txt
     * Precondition: Verbs.txt exists.
     * @return randomVerb
     * @throws FileNotFoundException if the file Verbs.txt is not found.
     */
    public String verbs() throws FileNotFoundException {
        Scanner verbFile = new Scanner(new File("Verbs.txt"));

        while(verbFile.hasNext()){
            verbsList.add(verbFile.nextLine());
        }

        String[] verbsArray = verbsList.toArray(new String[50]);

        int index = new Random().nextInt(verbsArray.length);
        String randomVerb = (verbsArray[index]);

        return randomVerb;
    }
    
    /**
     * Desc: Gets a random noun from food.txt
     * Precondition: Food.txt exists
     * @return randomFood
     * @throws FileNotFoundException if the file Food.txt is not found.
     */
    public String foods() throws FileNotFoundException {
        Scanner foodsFile = new Scanner(new File("Food.txt"));

        while(foodsFile.hasNext()){
            foodsList.add(foodsFile.nextLine());
        }

        String[] foodsArray = foodsList.toArray(new String[95]);
        int index = new Random().nextInt(foodsArray.length);
        String randomFood = (foodsArray[index]);

        return randomFood;
    }

    /**
     * Desc: Gets a random fruit from file Fruits.txt.
     * Precondition: Fruits.txt exists.
     * @return randomFruit
     * @throws FileNotFoundException if the file Fruits.txt is not found.
     */
    public String fruits() throws FileNotFoundException {
        Scanner fruitsFile = new Scanner(new File("Fruits.txt"));

        while(fruitsFile.hasNext()){
            foodsList.add(fruitsFile.nextLine());
        }

        String[] fruitsArray = fruitsList.toArray(new String[36]);
        int index = new Random().nextInt(fruitsArray.length);
        String randomfruit = (fruitsArray[index]);

        return randomfruit;
    }

    /**
     * Desc: Gets a random vegetable from Vegetables.txt
     * Precondition: Vegetables.txt exists.
     * @return randomVegetables
     * @throws FileNotFoundException if the file Vegetables.txt is not found.
     */
    public String vegetables() throws FileNotFoundException {
        Scanner vegetablesFile = new Scanner(new File("Vegetables.txt"));

        while(vegetablesFile.hasNext()){
            foodsList.add(vegetablesFile.nextLine());
        }

        String[] vegetablesArray = vegetablesList.toArray(new String[24]);
        int index = new Random().nextInt(vegetablesArray.length);
        String randomVegetable = (vegetablesArray[index]);

        return randomVegetable;
    }
}
