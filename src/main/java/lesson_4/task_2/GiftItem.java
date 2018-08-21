package lesson_4.task_2;

public abstract class GiftItem {
    private String name;
    private double price;
    private double weight;

    public GiftItem(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public GiftItem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "name = " + name + ", price = " + price + " $, weight = " + weight + " pounds";
    }

}
