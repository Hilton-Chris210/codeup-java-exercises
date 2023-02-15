public class DishTest {

    public static void main(String[] args) {
        Dish dish1 = new Dish(100, "pizza", true);
        dish1.printSummary();

        Dish dish2 = new Dish(200, "burger", false);
        dish2.printSummary();

        Dish dish3 = new Dish(300, "fries", true);




        DishTools.analyzeDishCost(dish1);
        DishTools.flipRecommendation(dish2);
        DishTools.shoutDishName(dish3);
        dish3.printSummary();




    }
}
