package lesson_4.task_2;

public class Base {

    public static void main(String[] args) {
        Candy candy1 = new Candy("Mars", 2.33, 0.5, "black");
        Candy candy2 = new Candy();
        candy2.setName("Bounty");
        candy2.setPrice(3.10);
        candy2.setWeight(0.6);
        candy2.setColor("blue");

        Jellybean jellybean1 = new Jellybean("FunnyJelly", 3.5, 0.25, 5);
        Jellybean jellybean2 = new Jellybean();
        jellybean2.setName("WowJelly");
        jellybean2.setPrice(1.99);
        jellybean2.setWeight(0.38);
        jellybean2.setSize(3.4);

        Biscuit biscuit1 = new Biscuit("CappuccinoBiscuit", 5.20, 1.2, "Coffee");
        Biscuit biscuit2 = new Biscuit();
        biscuit2.setName("Tropic");
        biscuit2.setPrice(4.90);
        biscuit2.setWeight(0.94);
        biscuit2.setTaste("Mango");

        GiftItem[] newYearGift = {candy1, candy2, jellybean1, jellybean2, biscuit1, biscuit2};

        System.out.println("The content of the gift:");
        double totalPrice = 0;
        double totalWeight = 0;
        for (GiftItem item : newYearGift) {
            totalPrice += item.getPrice();
            totalWeight += item.getWeight();
            System.out.println(item.toString());
        }
        System.out.println("________________________");
        System.out.printf("Total price of the gift: %.2f $ \n", totalPrice);
        System.out.printf("Total weight of the gift: %.2f pounds \n", totalWeight);

    }
}
