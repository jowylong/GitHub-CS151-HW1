package hw1.code.ong;

/**
 * Food class that initializes the food name and sentence.
 */
public class Food {

    /**
     * Food variable.
     */
    private String food;

    /**
     * Initializes the food name.
     * @param newFood Name of the food
     */
    public void setFood(String newFood) {
        food = newFood;
    }

    /**
     * Prints a sentence that involves the food name.
     */
    public void sayFood(){
        System.out.println("My favorite food is " + food + "!");
    }
}
