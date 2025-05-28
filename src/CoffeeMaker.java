import java.util.HashMap;
import java.util.Map;

public class CoffeeMaker {
    private final Map<String, Coffee> drinks = new HashMap<>();

    public CoffeeMaker() {
        drinks.put("c2", new Coffee("Espresso", 1.5f, 5));
        drinks.put("c3", new Coffee("Cappuccino", 2.0f, 3));
        drinks.put("c4", new Coffee("Chocolat chaud", 2.5f, 2));
    }
}
