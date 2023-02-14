public class DishTest {

    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.costInCents = 1000;
        dish1.nameOfDish = "Pizza";
        dish1.wouldRecommend = true;
        dish1.printSummary();


        Dish dish2 = new Dish();
        dish2.costInCents = 500;
        dish2.nameOfDish = "Salad";
        dish2.wouldRecommend = true;
        dish2.printSummary();




    }
}
