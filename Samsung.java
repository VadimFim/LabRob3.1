import java.util.Random;
public class Samsung {
    int weight;
    String color;
    String name;
    int diagonal;
    int time;

    public Samsung(String name, int weight, String color, int diagonal) {
        this.weight = weight;
        this.name = name;
        this.color = color;
        this.diagonal = diagonal;
        int worktime = 0;
        this.time = worktime;
    }

    public void info() {
        System.out.println("Назва моделі: " + name + "; Вага моделі: " + weight + "г" + "; Колір моделі: " + color + "; Діагональ екрану: " + diagonal + " дюймів" + "; Час використання: " + time + " годин" + ";");
    }

    protected void worktimeinfo(double usageTime) {
        Random random = new Random();
        double randomUsageTime = random.nextDouble() * 30 + 1;
        System.out.println("Час використання смартфону: " + randomUsageTime);
        if (randomUsageTime > usageTime) {
            System.out.println("Цей телефон вживаний.");
        } else {
            System.out.println("Цей телефон не був у використані.");
        }
    }

    public static void specialMethod(int value) {
        System.out.println("Час на вітрині: " + value+"год.");
    }

    public void processAnotherInstance(Samsung anotherSamsung) {
    }

    public Samsung createCopy(int newWeight, String newColor, int newDiagonal, int newTime) {
        return new Samsung(name, newWeight, newColor, newDiagonal);
    }
    public void recursiveMethod(int iterations) {
        if (iterations > 0) {
            System.out.println("Кількість проданих моделей: " + iterations);
            recursiveMethod(iterations - 1);
        }
    }
}