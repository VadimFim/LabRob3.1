public class Xiaomi {
    double weight;
    String color;
    String name;
    double diagonal;
    double worktime;

    protected Xiaomi(String name, double weight, String color, double diagonal, double worktime) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.diagonal = diagonal;
        this.worktime = worktime;
    }

    protected void info() {
        System.out.println("Назва моделі: " + name + "; Вага моделі: " + weight + "г" + "; Колір моделі: " + color + "; Діагональ екрану: " + diagonal + " дюймів" + "; Час використання: " + worktime + " годин" + ";");
    }

    protected void worktimeinfo(double usageTime) {
        System.out.println("Час використання смартфону: " + usageTime);
    }

    public static void specialMethod(int value) {
        System.out.println("Час на вітрині: " + value+"год.");
    }

    public void recursiveMethod(int iterations) {
        if (iterations > 0) {
            System.out.println("Кількість проданих моделей: " + iterations);
            recursiveMethod(iterations - 1);
        }
    }
}