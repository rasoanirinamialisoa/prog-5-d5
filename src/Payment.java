public class Payment {
    public float amount;

    public Payment() {
        this.amount = 0;
    }
    public void addAmount(float value) {
        this.amount += value;
    }

    public boolean isSufficient(float price) {
        return amount >= price;
    }

    public void deduct(float price) {
        if (isSufficient(price)) {
            amount -= price;
        }
    }

    public float getBalance() {
        return amount;
    }
}
