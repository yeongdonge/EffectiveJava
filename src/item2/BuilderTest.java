package item2;

import static item2.NyPizza.Size.SMALL;
import static item2.Pizza.Topping.*;

public class BuilderTest {
    public static void main(String[] args) {
        // 점층적 생성자 패턴
        NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 0, 35, 27);

        //자바빈즈 패턴
        JavaBeansNutritionFacts coke = new JavaBeansNutritionFacts();
        coke.setServingSize(240);
        coke.setServings(8);
        coke.setCalories(100);
        coke.setSodium(35);
        coke.setCarbohydtate(27);

        BuilderNutritionFacts pepsi = new BuilderNutritionFacts.Builder(240, 0)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();

        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM)
                .sauceInside()
                .build();
    }
}
