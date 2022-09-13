package Laba2;

public class Wall implements Barriers {
    int heightWall;

    public Wall(WallMass wallMass) {
        this.heightWall = wallMass.getLenghtDist();
    }
    @Override
    public boolean go(RunAndJump runAndJump) {
            return runAndJump.jump(heightWall);
    }

    public int getHeightWall() {
        return heightWall;
    }
}
