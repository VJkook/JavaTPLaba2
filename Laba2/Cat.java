package Laba2;

public class Cat implements RunAndJump {
    private String name;
    private int MaxDistanse;
    private int MaxHeight;

    public Cat(String name) {
        this.name = name;
        this.MaxDistanse = 100;
        this.MaxHeight = 1;
    }

    @Override
    public boolean run(int distance) {
        if (MaxDistanse >= distance) {
            System.out.println("Кот " + name + " прошел дистанцию длинной в " + distance + " м!");
            return true;
        } else {
            System.out.println("Кот " + name + " не прошел дистанцию длинной в " + distance + " м!");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (MaxHeight == 0) {
            System.out.println("Кот " + name + " не умеет прыгать !");
            return false;
        } else if (MaxHeight >= height) {
            System.out.println("Кот " + name + "перепрыгнул припятсвие высотой " + height + "м!");
            return true;
        } else {
            System.out.println("Кот " + name + "не перепрыгнул припятсвие высотой " + height + "м!");
            return false;
        }
    }
}
