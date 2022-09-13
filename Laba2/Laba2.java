package Laba2;

public class Laba2 {
    public static void main(String[] args) {

        Barriers[] pripyat = {
                new Treadmill(TreadmillMass.Running3),
                new Wall(WallMass.Wall1),
                new Treadmill(TreadmillMass.Running2),
                new Wall(WallMass.Wall3),
                new Treadmill(TreadmillMass.Running3)
        };

        RunAndJump[] runAndJumps = {
                new Cat("Васька "),
                new Robot("Железка "),
                new Human("Анатолий ")};

        for (RunAndJump r: runAndJumps) {
            for (int i = 0; i < pripyat.length; i++){
                if(!pripyat[i].go(r)){
                    System.out.println();
                    break;};
            }
        }
    }
}
