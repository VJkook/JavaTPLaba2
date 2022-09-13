package Laba2;
public class Robot implements RunAndJump {
private String name;
private int MaxDistanse;
private int MaxHeight;

    public Robot(String name) {
        this.name = name;
        this.MaxDistanse = 1000;
        this.MaxHeight = 0;
    }

    @Override
    public boolean run(int distance) {
        if (MaxDistanse >= distance) {
            System.out.println(name + "прошел дистанцию длинной в " + distance + " м!");
            return true;
        } else {
            System.out.println(name + "не прошел дистанцию длинной в " + distance + " м!");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (MaxHeight ==0) {
            System.out.println("Робот "+name+" не умеет прыгать !");
            return false;}
        else if (MaxHeight>=height) {
        System.out.println("Робот "+name + "перепрыгнул припятсвие высотой " + height + "м!"+MaxHeight);
            return true;
        } else {
            System.out.println("Робот "+name + "не перепрыгнул припятсвие высотой " + height + "м!");
            return false;
        }
    }
}
