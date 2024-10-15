package PrajwalPrograms.streampractisecpt;

public class Transaction {

    int id;
    double amount;
    String category;

    Transaction(int id, double amount, String category) {
        this.id = id;
        this.amount = amount;
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
