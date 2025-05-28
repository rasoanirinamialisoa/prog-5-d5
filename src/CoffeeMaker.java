import java.util.HashMap;
import java.util.Map;

public class CoffeeMaker {
    private final Map<String, Coffee> drinks = new HashMap<>();

    public CoffeeMaker() {
        drinks.put("c2", new Coffee("Espresso", 1.5f, 5));
        drinks.put("c3", new Coffee("Cappuccino", 2.0f, 3));
        drinks.put("c4", new Coffee("Chocolat chaud", 2.5f, 2));
    }

    public void displayChoices() {
        System.out.println("Boissons disponibles :");
        for (Map.Entry<String, Coffee> entry : drinks.entrySet()) {
            Coffee coffee = entry.getValue();
            System.out.printf("%s - %s (%.2f€, stock: %d)%n",
                    entry.getKey(), coffee.getName(), coffee.getPrice(), coffee.getStock());
        }
    }

    public String getCoffee(String drinkCode, Payment payment) {
        Coffee coffee = drinks.get(drinkCode.toLowerCase());
        if (coffee == null) {
            return "Option inconnue. Veuillez réessayer.";
        }

        if (!coffee.isAvailable()) {
            return "Cette boisson est actuellement indisponible.";
        }

        if (!payment.isSufficient(coffee.getPrice())) {
            return "Montant insuffisant. Veuillez réessayer.";
        }

        payment.deduct(coffee.getPrice());
        coffee.dispense();
        return "Voici votre " + coffee.getName() + " !";
    }
}
