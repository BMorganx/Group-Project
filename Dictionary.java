import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dictionary {

    private ArrayBag<String> adjectives = new ArrayBag<>();
    private ArrayBag<String> verbs = new ArrayBag<>();
    private ArrayBag<String> foods = new ArrayBag<>();
    private ArrayBag<String> fruits = new ArrayBag<>();
    private ArrayBag<String> vegetables = new ArrayBag<>();

    /**
     * Desc: Gets a random adjective from adjective.txt
     * Precondition: Adjectives.txt exists.
     * @return randomAdjective
     * @throws FileNotFoundException if the file Adjectives.txt is not found.
     */
    public String adjectives() throws FileNotFoundException {
        Scanner adFile = new Scanner(new File("Adjectives.txt"));

        while(adFile.hasNext()){
            adjectives.add(adFile.nextLine());
        }

        String randomAdjective = adjectives.grab();

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
            verbs.add(verbFile.nextLine());
        }

        String randomVerb = verbs.grab();

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
            foods.add(foodsFile.nextLine());
        }

        String randomFood = foods.grab();

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
            fruits.add(fruitsFile.nextLine());
        }

        String randomfruit = fruits.grab();

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
            vegetables.add(vegetablesFile.nextLine());
        }

        String randomVegetable = vegetables.grab();

        return randomVegetable;
    }


}
