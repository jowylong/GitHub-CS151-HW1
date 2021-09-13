package hw1.code.ong;

/**
 * FoodCaller class that prints out the food sentence with a food name.
 */
public class FoodCaller {

    /**
     * Adds the name of the food then prints out the favorite food sentence.
     * @param args Not used
     */
    public static void main(String[] args) {
        Food food1 = new Food();
        food1.setFood("sushi");
        food1.sayFood();
    }
}
