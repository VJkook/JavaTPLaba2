package Laba2;

public class Treadmill implements Barriers{
    int Maxdistance;
    public Treadmill(TreadmillMass treadmillMass) {
        this.Maxdistance = treadmillMass.getLenghtRoad();
    }

    @Override
    public boolean go(RunAndJump runAndJump) {
        return runAndJump.run(Maxdistance);
    }
}
