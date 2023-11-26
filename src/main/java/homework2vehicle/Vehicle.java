package homework2vehicle;

public abstract class Vehicle {
    // Базовый класс ""Vehicle"" содержит абстрактные методы ""testDrive()"" и ""park()"",
    // а также поля ""company"", ""model"", ""yearRelease"", ""numWheels"" и ""speed"".

    // region Methods
    abstract int testDrive();
    abstract int park();

    public int getNumWheels() {
        return numWheels;
    }

    public int getSpeed() {
        return speed;
    }

    //endregion

    // region Fields
    String company;
    String model;
    int yearRelease;
    int numWheels;
    int speed;
    // ednregion
}
