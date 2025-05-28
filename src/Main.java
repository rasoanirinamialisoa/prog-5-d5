import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMaker machine = new CoffeeMaker();
        Payment payment = new Payment();

        System.out.println("Bienvenue dans la machine à café CLI !");
        while (true) {
            System.out.println("\n1. Payer");
            System.out.println("2. Choisir une boisson");
            System.out.println("3. Quitter");
            System.out.print("Choix: ");
            String input = scanner.nextLine();

            switch (input) {
                case "1" -> {
                    System.out.print("Montant à insérer en euro: ");
                    try {
                        float amount = Float.parseFloat(scanner.nextLine());
                        if (amount <= 0) {
                            System.out.println("Montant invalide.");
                        } else {
                            payment.addAmount(amount);
                            System.out.printf("Montant total : %.2f€%n", payment.getBalance());
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrée invalide.");
                    }
                }

                case "2" -> {
                    machine.displayChoices();
                    System.out.print("Entrez le code de la boisson (c2, c3, c4) : ");
                    String code = scanner.nextLine();
                    String result = machine.getCoffee(code, payment);
                    System.out.println(result);
                }

                case "3" -> {
                    System.out.println("Merci d’avoir utilisé la machine à café !");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Choix invalide.");
            }
        }
    }
}
