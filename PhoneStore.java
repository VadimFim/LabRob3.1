import java.util.Random;

public class PhoneStore {
    public static void main(String[] args) {
        Samsung samsung1 = new Samsung("Samsung Galaxy A10", 110, "Grey", 6);
        Iphone iphone1 = new Iphone("Iphone 11 Pro", 107, "White", 5.5, 0);
        Xiaomi xiaomi = new Xiaomi("Xiaomi Redmi 12 Note", 92, "Black", 6.2, 0);

        samsung1.info();
        samsung1.worktimeinfo(5.5);
        Samsung.specialMethod(10);

        iphone1.info();
        iphone1.worktimeinfo(7.2);
        Iphone.specialMethod(15);

        xiaomi.info();
        xiaomi.worktimeinfo(6.8);
        Xiaomi.specialMethod(20);

        Samsung samsung2 = new Samsung("Samsung Galaxy S20", 120, "Blue", 6);
        samsung1.processAnotherInstance(samsung2);

        Samsung copySamsung = samsung1.createCopy(125, "Red", 5, 10);
        copySamsung.info();

        xiaomi.recursiveMethod(5);
    }
}