package Laba2;

public enum WallMass {
    Wall1("Первое припятствие", 2), Wall2("Второе припятствие", 3), Wall3("Третье припятствие", 4);
    private String NumberWall;
    private int LenghtDist;

    public String getNumderDist() {
        return NumberWall;
    }

    public int getLenghtDist() {
        return LenghtDist;
    }

    WallMass(String numberWall, int lenghtDist) {
        NumberWall = numberWall;
        LenghtDist = lenghtDist;
    }
}
