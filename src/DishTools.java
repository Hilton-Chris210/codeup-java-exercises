public class DishTools {
    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static void shoutDishName(Dish dish){
        System.out.println(dish.nameOfDish.toUpperCase());
    }

    public static void analyzeDishCost(Dish dish){
        if (dish.costInCents > AVERAGE_COST_OF_DISH_IN_CENTS){
            System.out.println("More expensive than average");
        } else if (dish.costInCents == AVERAGE_COST_OF_DISH_IN_CENTS){
            System.out.println("Average cost");
        } else {
            System.out.println("Less expensive than average");
        }
    }

    public static void flipRecommendation(Dish dish){
        if (dish.wouldRecommend == true){
            dish.wouldRecommend = false;
        } else {
            dish.wouldRecommend = true;
        }
    }

}
/*
    Create a class of static members (variables and methods) called DishTools
          - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 1300
          - shoutDishName() - that takes in a Dish object and prints out the name in all caps
          - analyzeDishCost() - that takes in a Dish object and will print out either “More expensive than average” or “Less expensive than average”, depending on the value of the dish costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS
          - flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value
          Try out the DishTools methods with Dish objects in the DishTest main method
          BONUS - add some static methods to the Dish class that compares two dishes in some way
*/