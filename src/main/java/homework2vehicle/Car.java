package homework2vehicle;

public class Car extends Vehicle{
    // Класс ""Car"" расширяет ""Vehicle"" и реализует его абстрактные методы.
    // При создании объекта ""Car"", число колес устанавливается в 4, а скорость в 0.
    // В методе ""testDrive()"" скорость устанавливается на 60, а в методе ""park()"" - обратно в 0.

    //region Constructors
    public Car(String company, String model, int yearRelease){
        this.company = company;
        this.model = model;
        this.yearRelease = yearRelease;
        this.numWheels = 4;
        this.speed = 0;
    }
    //endregion

    // region Methods
    @Override
    public int testDrive(){
        if (this.speed == 0) {
            this.speed = 60;
            return this.speed;
        }
        else {
            throw new RuntimeException("Какие-то проблемы со скоростью автомобиля, тест-драйв невозможен");
        }
    }

    @Override
    public int park(){
        if (this.speed == 60) {
            this.speed = 0;
            return this.speed;
        }
        else {
            throw new RuntimeException("Какие-то проблемы со скоростью автомобиля, парковка невозможна");
        }
    }

    public int getNumWheels() {
        return numWheels;
    }

    public int getSpeed() {
        return speed;
    }
    //endregion
}
