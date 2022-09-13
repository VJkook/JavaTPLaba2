package Laba2;

public class Human implements RunAndJump {
    private String name;
    private int MaxDistanse;
    private int MaxHeight;

    public Human(String name) {
        this.name = name;
        this.MaxDistanse = 5000;
        this.MaxHeight = 3;
    }

    @Override
    public boolean run(int distance) {
        if (MaxDistanse >= distance) {
            System.out.println("Человек "+name + " прошел дистанцию длинной в " + distance + " м!");
            return true;
        } else {
            System.out.println("Человек "+name + " не прошел дистанцию длинной в " + distance + " м!");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (MaxHeight ==0){
            System.out.println("Человек "+name+" не умеет прыгать !");
            return false;}
        else if (MaxHeight>=height) {
            System.out.println("Человек "+name + "перепрыгнул припятсвие высотой " + height + "м!");
            return true;
        } else {
            System.out.println("Человек "+name + "не перепрыгнул припятсвие высотой " + height + "м!");
            return false;
        }
    }
}
